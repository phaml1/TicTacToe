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
    public boolean checkRow(Character letter){
        for(int i = 0; i < 3; i++){
            if(this.matrix[i][0] == letter && this.matrix[i][1] == letter && this.matrix[i][2] == letter){
                return true;
            }
        }
        return false;
    }

    public boolean checkColumn(Character letter){
        for(int i = 0; i < 3; i++){
            if(this.matrix[0][i] == letter && this.matrix[1][i] == letter && this.matrix[2][i] == letter){
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagonal(Character letter){
         if (this.matrix[0][0] == letter && this.matrix[1][1] == letter && this.matrix[2][2] == letter) {
             return true;
         }else return this.matrix[0][2] == letter && this.matrix[1][1] == letter && this.matrix[2][0] == letter;
    }
    public Boolean isInFavorOfX() {
        if (this.checkRow('X')){
            return true;
        }else if(this.checkColumn('X')){
            return this.checkColumn('X');
        }
        else return this.checkDiagonal('X');
    }

    public Boolean isInFavorOfO() {
        return checkRow('O') || checkColumn('O') || checkDiagonal('O');
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
