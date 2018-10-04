/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import board.Board;
import board.Move;

/**
 *
 * @author andre
 */
public interface MoveAlgorithm {
    
    Move execute(Board board, int depth);
    
}
