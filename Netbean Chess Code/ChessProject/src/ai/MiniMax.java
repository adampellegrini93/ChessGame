/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import board.Board;
import board.Move;
import player.MoveTransition;

/**
 *
 * @author andre
 */
public class MiniMax implements MoveAlgorithm{
    
    private final BoardEvaluator boardEvaluator;
    
    public MiniMax(){
        this.boardEvaluator = new BasicBoardEvaluator();
    }
    
    @Override
    public String toString() {
        return "MiniMax";
    }
    
    @Override
    public Move execute(Board board, int depth){
        
        final long startTime = System.currentTimeMillis();
        
        Move bestMove = null;
        
        int maxSeenValue = Integer.MIN_VALUE;
        int minSeenValue = Integer.MAX_VALUE;
        
        int currentValue;
        
        System.out.println(board.currentPlayer() + " THINKING with depth = " + depth);
        
        int numMoves = board.currentPlayer().getLegalMoves().size();
        
        for(final Move move : board.currentPlayer().getLegalMoves()) {
            final MoveTransition moveTransition = board.currentPlayer().makeMove(move);
            if(moveTransition.getMoveStatus().isDone()) {
                //if current player is white, next move is a minimizing move, vice versa
                currentValue = board.currentPlayer().getAlliance().isWhite() ?
                        min(moveTransition.getTransitionBoard(), depth - 1) :
                        max(moveTransition.getTransitionBoard(), depth - 1);
                
                if(board.currentPlayer().getAlliance().isWhite() && currentValue >= maxSeenValue) {
                    maxSeenValue = currentValue;
                    bestMove = move;
                }
                else if(board.currentPlayer().getAlliance().isBlack() && currentValue <= minSeenValue) {
                    minSeenValue = currentValue;
                    bestMove = move;
                }
            }
        }
        final long executionTime = System.currentTimeMillis() - startTime;
        
        return bestMove;
    }
    
    public int min (final Board board, final int depth){
        if(depth == 0) { //TO ADD: || gameover, then evaluate the board
            return this.boardEvaluator.evaluate(board, depth);
        }
        //Initialize the lowest seen value with the highest possible value
        int minSeenValue = Integer.MAX_VALUE;
        //Loop through all legal moves and record the lowest current value
        for(final Move move : board.currentPlayer().getLegalMoves()) {
            final MoveTransition moveTransition = board.currentPlayer().makeMove(move);
            if(moveTransition.getMoveStatus().isDone()) {
                final int currentValue = max(moveTransition.getTransitionBoard(), depth - 1);
                if(currentValue <= minSeenValue) {
                    minSeenValue = currentValue;
                }
            }
        }
        
        return minSeenValue;
    }
    
    public int max (final Board board, final int depth){
        if(depth == 0) { //TO ADD: || gameover, then evaluate the board
            return this.boardEvaluator.evaluate(board, depth);
        }
        //Initialize the highest seen value with the lowest possible value
        int maxSeenValue = Integer.MIN_VALUE;
        //Loop through all legal moves and record the highest current value
        for(final Move move : board.currentPlayer().getLegalMoves()) {
            final MoveTransition moveTransition = board.currentPlayer().makeMove(move);
            if(moveTransition.getMoveStatus().isDone()) {
                final int currentValue = min(moveTransition.getTransitionBoard(), depth - 1);
                if(currentValue >= maxSeenValue) {
                    maxSeenValue = currentValue;
                }
            }
        }
        
        return maxSeenValue;
    }
}
