package pieces;

import board.Board;
import board.BoardUtils;
import board.Move;
import board.Move.MajorMove;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Pawn extends Piece{
    
    private final static int[] CANDIDATE_MOVE_COORDINATES = {8, 16, 7, 9};

    public Pawn(final Alliance pieceAlliance, final int piecePosition) {
        super(PieceType.PAWN, piecePosition, pieceAlliance);
    }

    @Override
    public Collection<Move> calculateLegalMoves(final Board board) {
        
        final List<Move> legalMoves = new ArrayList<>();
        
        for(final int currentCandidateOffset : CANDIDATE_MOVE_COORDINATES){
            
            final int candidateDestinationCoordinate = this.piecePosition + (this.getPieceAlliance().getDirection() * currentCandidateOffset); 
            
            if(!BoardUtils.isValidTileCoordinate(candidateDestinationCoordinate)){
                continue;
            }
            
            if(currentCandidateOffset == 8 && board.getTile(candidateDestinationCoordinate).isTileOccupied()){ //non attacking pawn move
                //todo more work here! (deal with promotions)
                legalMoves.add(new Move.MajorMove(board, this, candidateDestinationCoordinate));
            }else if(currentCandidateOffset == 16 && this.isFirstMove() &&  //attacking pawn move
                    (BoardUtils.SECOND_ROW[this.piecePosition] && this.getPieceAlliance().isBlack()) || 
                    (BoardUtils.SEVENTH_ROW[this.piecePosition] && this.getPieceAlliance().isWhite())){
                final int behindCandidateDesitinationCoordinate = this.piecePosition + (this.pieceAlliance.getDirection() * 8);
                if(!board.getTile(behindCandidateDesitinationCoordinate).isTileOccupied() && 
                        !board.getTile(candidateDestinationCoordinate).isTileOccupied()){
                    legalMoves.add(new Move.MajorMove(board, this, candidateDestinationCoordinate));
                }  
            }else if(currentCandidateOffset == 7 &&
                    !((BoardUtils.EIGHTH_COLUMN[this.piecePosition] && this.pieceAlliance.isWhite() || 
                    (BoardUtils.FIRST_COLUMN[this.piecePosition] && this.pieceAlliance.isBlack())))){
                if(board.getTile(candidateDestinationCoordinate).isTileOccupied()){
                    final Piece pieceOnCandidate = board.getTile(candidateDestinationCoordinate).getPiece();
                    if(this.pieceAlliance != pieceOnCandidate.getPieceAlliance()){
                        legalMoves.add(new MajorMove(board, this, candidateDestinationCoordinate));
                    }
                }
            }else if(currentCandidateOffset == 9 &&
                !((BoardUtils.FIRST_COLUMN[this.piecePosition] && this.pieceAlliance.isWhite() || 
                    (BoardUtils.EIGHTH_COLUMN[this.piecePosition] && this.pieceAlliance.isBlack())))){
                if(board.getTile(candidateDestinationCoordinate).isTileOccupied()){
                    final Piece pieceOnCandidate = board.getTile(candidateDestinationCoordinate).getPiece();
                    if(this.pieceAlliance != pieceOnCandidate.getPieceAlliance()){
                        legalMoves.add(new MajorMove(board, this, candidateDestinationCoordinate));
                    }
                }             
            }
        }     
        return Collections.unmodifiableList(legalMoves);
    }
    @Override
    public Pawn movePiece(final Move move) {
        return new Pawn(move.getMovedPiece().getPieceAlliance(), move.getDestinationCoordinate());
    }
    
    @Override
    public String toString(){
        return PieceType.PAWN.toString();
    }
    
}
