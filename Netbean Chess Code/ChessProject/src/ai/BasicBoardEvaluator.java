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

    @Override
    public int evaluate(final Board board, final int depth) {
        
        //return positive if white has an advantage, negative if black has an advantage
        return scorePlayer(board, board.whitePlayer(), depth) -
               scorePlayer(board, board.blackPlayer(), depth);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int scorePlayer(final Board board, final Player player, final int depth) {
        return pieceValue(player); // this plus certain factors (i.e. checkmate, mobility, castled, etc.)
    }
    
    private static int pieceValue(final Player player){
        int pieceValueScore = 0;
        for(final Piece piece : player.getActivePieces()) {
            pieceValueScore += piece.getPieceValue();
        }
        return pieceValueScore;
    }
    
}
