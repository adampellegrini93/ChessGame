package player;

import board.Board;
import board.Move;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import pieces.Alliance;
import pieces.King;
import pieces.Piece;


public abstract class Player {

    protected final Board board;
    protected final King playerKing;
    protected final Collection<Move> legalMoves;
    private final boolean isInCheck;
    
    Player(final Board board,
            final Collection<Move> legalMoves,
            final Collection<Move> opponentMoves){    
        this.board = board;
        this.playerKing = establishKing();
        //this.legalMoves = legalMoves;
        this.legalMoves = Collections.unmodifiableList(merge(legalMoves, calculateKingCastles(legalMoves, opponentMoves)));
        this.isInCheck = !Player.calculateAttacksOnTile(this.playerKing.getPiecePosition(), opponentMoves).isEmpty();
    }
    
    public List<Move> merge(Collection<Move> m1, Collection<Move> m2)
    {
        final List<Move> newMoves = new ArrayList<>();
        newMoves.addAll(m1);
        newMoves.addAll(m1);
        return newMoves;
    }
    
    public King getPlayerKing(){
        return this.playerKing;
    }
    
    public Collection<Move> getLegalMoves(){
        return this.legalMoves;
    }
    
    protected static Collection<Move> calculateAttacksOnTile(int piecePosition, Collection<Move> moves) {
        final List<Move> attackMoves = new ArrayList<>();
        for(final Move move: moves){
            if(piecePosition == move.getDestinationCoordinate()){
                attackMoves.add(move);
            }
        }
        return Collections.unmodifiableList(attackMoves);
    }
    

    private King establishKing() {
        for(final Piece piece : getActivePieces()){
            if(piece.getPieceType().isKing()){
                return (King) piece;                
            }
        }
        throw new RuntimeException("Should not reach here! not valid board!!");
    }
    
    public boolean isMoveLegal(final Move move){
        return this.legalMoves.contains(move);
    }
    
    public boolean isInCheck(){
        return this.isInCheck;
    }
    
    public boolean isInCheckMate(){
        return this.isInCheck && !hasEscapeMoves();
    }
    
    public boolean isInStaleMate(){
        return !this.isInCheck && !hasEscapeMoves();
    }
    
    protected boolean hasEscapeMoves(){
        for(final Move move : this.legalMoves){
            final MoveTransition transition = makeMove(move);
            if(transition.getMoveStatus().isDone()){
                return true;
            } 
        }
        return false;
    }
    
    public boolean isCastled(){
        return false;
    }
    
    public MoveTransition makeMove(final Move move){
        
        if(!isMoveLegal(move)){
            return new MoveTransition(this.board, move, MoveStatus.ILLEGAL_MOVE);
        }
        
        final Board transitionBoard = move.execute();
        
        final Collection<Move> kingAttacks = Player.calculateAttacksOnTile(transitionBoard.currentPlayer().getOpponent().getPlayerKing().getPiecePosition(),
                transitionBoard.currentPlayer().getLegalMoves());
        
        if(!kingAttacks.isEmpty()){
            return new MoveTransition(this.board,move,MoveStatus.LEAVES_PLAYER_IN_CHECK);
        }
        
        return new MoveTransition(transitionBoard, move, MoveStatus.DONE);
    }
    
    public abstract Collection<Piece> getActivePieces();
    public abstract Alliance getAlliance();
    public abstract Player getOpponent();
    protected abstract Collection<Move> calculateKingCastles(Collection<Move> playerLegal, Collection<Move> opponentsLegals);
}
