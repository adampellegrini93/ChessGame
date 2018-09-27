package board;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import pieces.Alliance;
import pieces.Bishop;
import pieces.Knight;
import pieces.Piece;
import pieces.Queen;
import pieces.Rook;
import pieces.King;
import pieces.Pawn;
import player.BlackPlayer;
import player.Player;
import player.WhitePlayer;

public class Board {
    
    private final List<Tile> gameBoard;
    private final Collection<Piece> whitePieces;
    private final Collection<Piece> blackPieces;
    
    private final WhitePlayer whitePlayer;
    private final BlackPlayer blackPlayer;
    private Player currentPlayer;
    
    private Board(final Builder builder){
        this.gameBoard = createGameBoard(builder);
        this.whitePieces = calculateActivePieces(this.gameBoard, Alliance.White);
        this.blackPieces = calculateActivePieces(this.gameBoard, Alliance.Black); 
        final Collection<Move> whiteStandardLegalMoves = calculateLegalMoves(this.whitePieces);
        final Collection<Move> blackStandardLegalMoves = calculateLegalMoves(this.blackPieces);     
        this.whitePlayer = new WhitePlayer(this, whiteStandardLegalMoves, blackStandardLegalMoves);
        this.blackPlayer = new BlackPlayer(this, whiteStandardLegalMoves, blackStandardLegalMoves);
        this.currentPlayer = builder.nextMoveMaker.choosePlayer(this.whitePlayer, this.blackPlayer);
    }
    
    @Override
    public String toString(){
        final StringBuilder builder = new StringBuilder();
        for(int i = 0; i < BoardUtils.NUM_TILES; i++){
            final String tileText = this.gameBoard.get(i).toString();
            builder.append(String.format("%3s", tileText));
            if((i + 1) % BoardUtils.NUM_TILES_PER_ROW == 0){
                builder.append("\n");
            }
        }
        return builder.toString();
    }
    
    public void switchPlayer(Player current){
        if(current == whitePlayer){
            this.currentPlayer = blackPlayer;
        }else{
            this.currentPlayer = whitePlayer;
        }
    }
    
    public Player whitePlayer(){
        return this.whitePlayer;
    }
    
    public Player blackPlayer(){
        return this.blackPlayer;
    }
    
    public Player currentPlayer(){
        return this.currentPlayer;
    }
    
    public Collection<Piece> getBlackPieces(){
        return this.blackPieces;
    }
    
    public Collection<Piece> getWhitePieces(){
        return this.whitePieces;
    }
    
    private Collection<Move> calculateLegalMoves(final Collection<Piece> pieces) { 
        return pieces.stream().flatMap(piece -> piece.calculateLegalMoves(this).stream()).collect(Collectors.toList());
    }

    private static Collection<Piece> calculateActivePieces(final List<Tile> gameBoard, final Alliance alliance) {
        final List<Piece> activePieces = new ArrayList<>();
        for(final Tile tile : gameBoard){
            if(tile.isTileOccupied()){
                final Piece piece = tile.getPiece();
                if(piece.getPieceAlliance() == alliance){
                    activePieces.add(piece);
                }
            }
        }
        return Collections.unmodifiableList(activePieces);
    }
    
    public Tile getTile(final int tileCoordinate){
        return gameBoard.get(tileCoordinate);
    }
    
    private static List<Tile> createGameBoard(final Builder builder){
        final Tile[] tiles = new Tile[BoardUtils.NUM_TILES];
        for(int i = 0; i < BoardUtils.NUM_TILES; i++){
            tiles[i] = Tile.createTile(i, builder.boardConfig.get(i));
        }
        return Collections.unmodifiableList(Arrays.asList(tiles));
    }
    
    public static Board createStandardBoard(){
        final Builder builder = new Builder();
        
        //black Team
        builder.setPiece(new Rook(Alliance.Black,0));
        builder.setPiece(new Knight(Alliance.Black,1));
        builder.setPiece(new Bishop(Alliance.Black,2));
        builder.setPiece(new Queen(Alliance.Black,3));
        builder.setPiece(new King(Alliance.Black,4));
        builder.setPiece(new Bishop(Alliance.Black,5));
        builder.setPiece(new Knight(Alliance.Black,6));
        builder.setPiece(new Rook(Alliance.Black,7));
        builder.setPiece(new Pawn(Alliance.Black,8));
        builder.setPiece(new Pawn(Alliance.Black,9));
        builder.setPiece(new Pawn(Alliance.Black,10));
        builder.setPiece(new Pawn(Alliance.Black,11));
        builder.setPiece(new Pawn(Alliance.Black,12));
        builder.setPiece(new Pawn(Alliance.Black,13));
        builder.setPiece(new Pawn(Alliance.Black,14));
        builder.setPiece(new Pawn(Alliance.Black,15));

        // White Team
        builder.setPiece(new Pawn(Alliance.White,48));
        builder.setPiece(new Pawn(Alliance.White,49));
        builder.setPiece(new Pawn(Alliance.White,50));
        builder.setPiece(new Pawn(Alliance.White,51));
        builder.setPiece(new Pawn(Alliance.White,52));
        builder.setPiece(new Pawn(Alliance.White,53));
        builder.setPiece(new Pawn(Alliance.White,54));
        builder.setPiece(new Pawn(Alliance.White,55));
        builder.setPiece(new Rook(Alliance.White,56));
        builder.setPiece(new Knight(Alliance.White,57));
        builder.setPiece(new Bishop(Alliance.White,58));
        builder.setPiece(new Queen(Alliance.White,59));
        builder.setPiece(new King(Alliance.White,60));
        builder.setPiece(new Bishop(Alliance.White,61));
        builder.setPiece(new Knight(Alliance.White,62));
        builder.setPiece(new Rook(Alliance.White,63));

        builder.setMoveMaker(Alliance.White);

        return builder.build();
    }

    public Collection<Move> getAllLegalMoves() {
        final List<Move> legalMoves = merge(this.whitePlayer.getLegalMoves(), this.blackPlayer.getLegalMoves());
        return Collections.unmodifiableList(legalMoves);
    }
    
    public List<Move> merge(Collection<Move> m1, Collection<Move> m2)
    {
        final List<Move> newMoves = new ArrayList<>();
        
        for(final Move move : m1){
            if(move != null){
                newMoves.addAll(m1); 
            }
        }
        for(final Move move : m2){
            if(move != null){
                newMoves.addAll(m1);   
            }
        }
        return newMoves;
    }

    public static class Builder {
        
        Map<Integer, Piece> boardConfig;
        Alliance nextMoveMaker;
        Pawn enPassantPawn;
        
        public Builder(){
            this.boardConfig = new HashMap<>();
        }
        
        public Builder setPiece(final Piece piece){
            this.boardConfig.put(piece.getPiecePosition(), piece);
            return this;
        }
        
        public Builder setMoveMaker(final Alliance nextMoveMaker){
            this.nextMoveMaker = nextMoveMaker;
            return this;
        }
        
        public Board build() {
            return new Board(this);
        }
        
        public void setEnPassantPawn(Pawn enPassantPawn){
            this.enPassantPawn = enPassantPawn;
        }
    }

}
