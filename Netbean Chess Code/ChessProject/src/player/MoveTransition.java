package player;

import board.Board;
import board.Move;

public class MoveTransition {
    private final Board transistionBoard;
    private final Move move;
    private final MoveStatus moveStatus;
    
    public MoveTransition(final Board transitionBoard, final Move move, final MoveStatus moveStatus) {
        this.transistionBoard = transitionBoard;
        this.move = move;
        this.moveStatus = moveStatus;
    }
    
    public MoveStatus getMoveStatus(){
        return this.moveStatus;
    }
    
    public Board getTransitionBoard(){
        return this.transistionBoard;
    }
}
