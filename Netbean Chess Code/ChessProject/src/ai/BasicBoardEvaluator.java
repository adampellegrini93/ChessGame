/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import board.Board;
import pieces.Piece;
import player.Player;

/**
 *
 * @author andre
 */
public final class BasicBoardEvaluator implements BoardEvaluator {

    private static final int CHECK_BONUS = 75;
    private static final int CHECK_MATE_BONUS = 1000;
    private static final int DEPTH_BONUS = 100;
    private static final int CASTLE_BONUS = 60;
    
    @Override
    public int evaluate(final Board board, final int depth) {
        
        //return positive if white has an advantage, negative if black has an advantage
        return scorePlayer(board, board.whitePlayer(), depth) -
               scorePlayer(board, board.blackPlayer(), depth);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int scorePlayer(final Board board, final Player player, final int depth) {
        return pieceValue(player) + 
                mobility(player) + 
                check(player) + 
                checkmate(player, depth) + 
                castled(player);
        // this plus certain factors (i.e. checkmate, mobility, castled, etc.)
    }
    
    //for the given board being looked at, how many legal moves does the player have?
    private static int mobility(final Player player) {
        return player.getLegalMoves().size();
    }
    
    private static int check(final Player player) {
        return player.getOpponent().isInCheck() ? CHECK_BONUS : 0;
    }
    
    //if CHECKMATE is found sooner, before depth=0, give a larger bonus
    private static int checkmate(final Player player, int depth) {
        return player.getOpponent().isInCheckMate() ? CHECK_MATE_BONUS * depthBonus(depth): 0;
    }
    
    private static int depthBonus(int depth) {
        return depth == 0 ? 1 : DEPTH_BONUS * depth;
    }
    
    private static int castled(Player player) {
        return player.isCastled() ? CASTLE_BONUS : 0;
    }
    
    private static int pieceValue(final Player player){
        int pieceValueScore = 0;
        for(final Piece piece : player.getActivePieces()) {
            pieceValueScore += piece.getPieceValue();
        }
        return pieceValueScore;
    }
    
}
