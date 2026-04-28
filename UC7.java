import java.util.Random;

public class UC7{

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

    public static void main(String[] args) {
        computerMove();
        printBoard();
    }

    static void computerMove() {
        Random rand = new Random();
        int row, col;

        while (true) {
            row = rand.nextInt(3);
            col = rand.nextInt(3);

            if (board[row][col] == '-') {
                board[row][col] = computerSymbol;
                break;
            }
        }
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
