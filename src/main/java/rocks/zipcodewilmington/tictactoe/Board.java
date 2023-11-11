package rocks.zipcodewilmington.tictactoe;

import java.lang.reflect.Array;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        Board board = new Board(matrix);
        for (int i = 0; i < board.matrix.length; i++){
            for(int j = 0; j < board.matrix[i].length; j++){
                if(board.matrix[0][1] == 'X' && board.matrix[1][1] == 'X' && board.matrix[2][1] =='X'){
                return true;
                } else if (board.matrix[0][0] == 'X' && board.matrix[1][0] == 'X' && board.matrix[2][0] =='X') {
                    return true;
                }else if (board.matrix[0][2] == 'X' && board.matrix[1][2] == 'X' && board.matrix[2][2] =='X') {
                    return true;
                }else if (board.matrix[0][0] == 'X' && board.matrix[0][1] == 'X' && board.matrix[0][2] =='X') {
                    return true;
                }else if (board.matrix[1][0] == 'X' && board.matrix[1][1] == 'X' && board.matrix[1][2] =='X') {
                    return true;
                }else if (board.matrix[2][0] == 'X' && board.matrix[2][1] == 'X' && board.matrix[2][2] =='X') {
                    return true;
                }else if (board.matrix[0][0] == 'X' && board.matrix[1][1] == 'X' && board.matrix[2][2] =='X') {
                    return true;
                }else if (board.matrix[0][2] == 'X' && board.matrix[1][1] == 'X' && board.matrix[2][0] =='X') {
                    return true;
                }else {
                    break;
                }
            }
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        Board board = new Board(matrix);
        for (int i = 0; i < board.matrix.length; i++){
            for(int j = 0; j < board.matrix[i].length; j++){
                if(board.matrix[0][1] == 'O' && board.matrix[1][1] == 'O' && board.matrix[2][1] =='O'){
                    return true;
                } else if (board.matrix[0][0] == 'O' && board.matrix[1][0] == 'O' && board.matrix[2][0] =='O') {
                    return true;
                }else if (board.matrix[0][2] == 'O' && board.matrix[1][2] == 'O' && board.matrix[2][2] =='O') {
                    return true;
                }else if (board.matrix[0][0] == 'O' && board.matrix[0][1] == 'O' && board.matrix[0][2] =='O') {
                    return true;
                }else if (board.matrix[1][0] == 'O' && board.matrix[1][1] == 'O' && board.matrix[1][2] =='O') {
                    return true;
                }else if (board.matrix[2][0] == 'O' && board.matrix[2][1] == 'O' && board.matrix[2][2] =='O') {
                    return true;
                }else if (board.matrix[0][0] == 'O' && board.matrix[1][1] == 'O' && board.matrix[2][2] =='O') {
                    return true;
                }else if (board.matrix[0][2] == 'O' && board.matrix[1][1] == 'O' && board.matrix[2][0] =='O') {
                    return true;
                }else {
                    break;
                }
            }
        }
        return false;
    }

    public Boolean isTie() {
        Board board = new Board(matrix);
        if(board.isInFavorOfX()){
            return false;
        } else if (board.isInFavorOfO()){
            return false;
        }else {
            return true;
        }
    }

    public String getWinner() {
        String winner = "";
        Board board = new Board(matrix);
        if(board.isInFavorOfX()){
            winner = "X";
            return winner;
        }else if(board.isInFavorOfO()){
            winner = "O";
            return winner;
        } else{
         return winner;
        }
    }
}
