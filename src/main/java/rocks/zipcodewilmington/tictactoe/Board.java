package rocks.zipcodewilmington.tictactoe;

import java.lang.reflect.Array;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Board(Character[][] matrix) {
    }

    public Boolean isInFavorOfX() {
        return null;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        Character[][] matrix = new Character[3][3];
        Board board = new Board(matrix);
        for(int i = 0; i < 9; i++){
            String win = "";
            switch(i){
                case 0:
                    win = matrix[0][0].toString() + matrix[1][0].toString() + matrix[2][0].toString();
                    break;
            }
        }
        return null;
    }

}
