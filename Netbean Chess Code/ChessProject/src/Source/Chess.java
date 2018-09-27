package Source;

import board.Board;
import board.Move;
import player.MoveTransition;

public class Chess {
    
    public static void main(String[] args){
        
        testMovingPawn();
        //testMovingKnight
    }
    
    public static void testMovingPawn()
    {
        //testing creating and printing board
        Board board = Board.createStandardBoard(); 
        System.out.println("Original Board");
        System.out.println(board);
        
        //testing moving pieces on board
        Move move = Move.MoveFactory.createMove(board, 55, 47); //can also make 55, 39
        MoveTransition transition = board.currentPlayer().makeMove(move);
        if(transition.getMoveStatus().isDone()){
            board = transition.getTransitionBoard(); 
        }
        System.out.println("Board after moving pawn from h2 to h3");
        System.out.println(board);
    }
    
        public static void testMovingKnight()
    {
        //testing creating and printing board
        Board board = Board.createStandardBoard(); 
        System.out.println("Original Board");
        System.out.println(board);
        
        //testing moving pieces on board
        Move move = Move.MoveFactory.createMove(board, 57, 42); //can also 57,42
        MoveTransition transition = board.currentPlayer().makeMove(move);
        if(transition.getMoveStatus().isDone()){
            board = transition.getTransitionBoard(); 
        }
        System.out.println("Board after moving knight from b1 to a3");
        System.out.println(board);
    }
}
