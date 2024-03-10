package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private final Character[][] gameBoard;
    public Board(Character[][] matrix) {
        this.gameBoard = matrix;
    }

    public Boolean isInFavorOfX() {
        if(getWinner()=="X"){
            return true;
        }
        else
            return false;
    }

    public Boolean isInFavorOfO() {
        if(getWinner()=="O"){
            return true;
        }
        else
            return false;
    }
    private boolean checkSymbol(char symbol) {
        // Checking for Rows
        for (int i = 0; i < 3; i++) {
            if (this.gameBoard[i][0] == symbol && this.gameBoard[i][1] == symbol && this.gameBoard[i][2] == symbol) {
                return true;
            }
        }
        // Checking for all Columns
        for(int i=0;i<3;i++){
            if(this.gameBoard[0][i] ==symbol && this.gameBoard[1][i] == symbol && this.gameBoard[2][i]== symbol){
                return true;
            }
        }
        // Checking diagonally
        if(this.gameBoard[0][0] == symbol && this.gameBoard[1][1]==symbol && this.gameBoard[2][2]==symbol){
            return true;
        } else if (this.gameBoard[0][2] == symbol && this.gameBoard[1][1]==symbol && this.gameBoard[2][0]==symbol) {
            return true;

        }
        else
            return false;

    }

    public Boolean isTie() {
        if(getWinner()=="")
            return true;
        else
            return false;
    }

    public String getWinner() {
        if(checkSymbol('X')){
            return "X";
        } else if (checkSymbol('O')) {
            return "O";
        }
        else
            return "";
    }

}
