package pieces;

import board.Board;
import board.BoardUtils;
import board.Move;
import board.Move.AttackMove;
import board.Move.MajorMove;
import board.Tile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Bishop extends Piece{

    private final static int[] CANDIDATE_MOVE_VECTOR_COORDINATES = { -9, -7, 7, 9 };
    
    public Bishop(final Alliance pieceAlliance, final int piecePosition) {
        super(PieceType.BISHOP, piecePosition, pieceAlliance);
    }

    @Override
    public Collection<Move> calculateLegalMoves(final Board board) {
        
        final List<Move> legalMoves = new ArrayList<>();
        
        for(final int candidateCoordinateOffset: CANDIDATE_MOVE_VECTOR_COORDINATES) {//loops through legal moves        
            int candidateDestinationCoordinate = this.piecePosition;           
            while(BoardUtils.isValidTileCoordinate(candidateDestinationCoordinate)){       
                if(isFirstColumnExclusion(candidateDestinationCoordinate, candidateCoordinateOffset) ||
                    isEighthColumnExclusion(candidateDestinationCoordinate, candidateCoordinateOffset)){
                    break;
                } 
                candidateDestinationCoordinate += candidateCoordinateOffset; //applys offset to current position    
                if (BoardUtils.isValidTileCoordinate(candidateDestinationCoordinate)) {
                    final Tile candidateDestinationTile = board.getTile(candidateDestinationCoordinate);
                    if (!candidateDestinationTile.isTileOccupied()) { //if not occupied by another piece currently
                        legalMoves.add(new MajorMove(board, this, candidateDestinationCoordinate));
                    } else { //if desination is currently occupied
                        final Piece pieceAtDestination = candidateDestinationTile.getPiece();
                        final Alliance pieceAlliance = pieceAtDestination.getPieceAlliance();
                        if (this.pieceAlliance != pieceAlliance) { //if on enemy piece
                            legalMoves.add(new AttackMove(board, this, candidateDestinationCoordinate, pieceAtDestination));
                        }
                        break;
                    }
                }
            }
        }
        return Collections.unmodifiableList(legalMoves);
    }
    
    @Override
    public Bishop movePiece(final Move move) {
        return new Bishop(move.getMovedPiece().getPieceAlliance(), move.getDestinationCoordinate());
    }

    @Override
    public String toString(){
        return PieceType.BISHOP.toString();
    }
    
    private static boolean isFirstColumnExclusion(final int currentPosition, final int candidateOffset){
        return BoardUtils.FIRST_COLUMN[currentPosition] && (candidateOffset == -9 || candidateOffset == 7);
    }
    
    private static boolean isEighthColumnExclusion(final int currentPosition, final int candidateOffset){
        return BoardUtils.EIGHTH_COLUMN[currentPosition] && (candidateOffset == -7 || candidateOffset == 9);
    }  
    
}
