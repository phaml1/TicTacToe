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
        for (Character[] characters : this.matrix) {
            for (int j = 0; j < characters.length; j++) {
                if (this.matrix[0][1] == 'X' && this.matrix[1][1] == 'X' && this.matrix[2][1] == 'X') {
                    return true;
                } else if (this.matrix[0][0] == 'X' && this.matrix[1][0] == 'X' && this.matrix[2][0] == 'X') {
                    return true;
                } else if (this.matrix[0][2] == 'X' && this.matrix[1][2] == 'X' && this.matrix[2][2] == 'X') {
                    return true;
                } else if (this.matrix[0][0] == 'X' && this.matrix[0][1] == 'X' && this.matrix[0][2] == 'X') {
                    return true;
                } else if (this.matrix[1][0] == 'X' && this.matrix[1][1] == 'X' && this.matrix[1][2] == 'X') {
                    return true;
                } else if (this.matrix[2][0] == 'X' && this.matrix[2][1] == 'X' && this.matrix[2][2] == 'X') {
                    return true;
                } else if (this.matrix[0][0] == 'X' && this.matrix[1][1] == 'X' && this.matrix[2][2] == 'X') {
                    return true;
                } else if (this.matrix[0][2] == 'X' && this.matrix[1][1] == 'X' && this.matrix[2][0] == 'X') {
                    return true;
                } else {
                    break;
                }
            }
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        for (Character[] characters : this.matrix) {
            for (int j = 0; j < characters.length; j++) {
                if (this.matrix[0][1] == 'O' && this.matrix[1][1] == 'O' && this.matrix[2][1] == 'O') {
                    return true;
                } else if (this.matrix[0][0] == 'O' && this.matrix[1][0] == 'O' && this.matrix[2][0] == 'O') {
                    return true;
                } else if (this.matrix[0][2] == 'O' && this.matrix[1][2] == 'O' && this.matrix[2][2] == 'O') {
                    return true;
                } else if (this.matrix[0][0] == 'O' && this.matrix[0][1] == 'O' && this.matrix[0][2] == 'O') {
                    return true;
                } else if (this.matrix[1][0] == 'O' && this.matrix[1][1] == 'O' && this.matrix[1][2] == 'O') {
                    return true;
                } else if (this.matrix[2][0] == 'O' && this.matrix[2][1] == 'O' && this.matrix[2][2] == 'O') {
                    return true;
                } else if (this.matrix[0][0] == 'O' && this.matrix[1][1] == 'O' && this.matrix[2][2] == 'O') {
                    return true;
                } else if (this.matrix[0][2] == 'O' && this.matrix[1][1] == 'O' && this.matrix[2][0] == 'O') {
                    return true;
                } else {
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
        } else return !board.isInFavorOfO();
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
