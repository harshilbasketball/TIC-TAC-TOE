
import java.util.Scanner;

public class UC8 {

    static char[] board = {'1','2','3','4','5','6','7','8','9'};
    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (!gameOver) {

            printBoard();

            if (isHumanTurn) {
                System.out.print("Human Turn (X). Enter position: ");
                int pos = sc.nextInt();

                if (board[pos - 1] != 'X' && board[pos - 1] != 'O') {
                    board[pos - 1] = 'X';
                    isHumanTurn = false;
                } else {
                    System.out.println("Position already taken!");
                }

            } else {
                System.out.println("Computer Turn (O)");

                for (int i = 0; i < 9; i++) {
                    if (board[i] != 'X' && board[i] != 'O') {
                        board[i] = 'O';
                        break;
                    }
                }

                isHumanTurn = true;
            }

            if (checkWin('X')) {
                printBoard();
                System.out.println("Human Wins!");
                gameOver = true;
            } else if (checkWin('O')) {
                printBoard();
                System.out.println("Computer Wins!");
                gameOver = true;
            } else if (isBoardFull()) {
                printBoard();
                System.out.println("Match Draw!");
                gameOver = true;
            }
        }

        sc.close();
    }

    static void printBoard() {
        System.out.println();
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("--+---+--");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("--+---+--");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    static boolean checkWin(char mark) {
        return (board[0] == mark && board[1] == mark && board[2] == mark) ||
               (board[3] == mark && board[4] == mark && board[5] == mark) ||
               (board[6] == mark && board[7] == mark && board[8] == mark) ||
               (board[0] == mark && board[3] == mark && board[6] == mark) ||
               (board[1] == mark && board[4] == mark && board[7] == mark) ||
               (board[2] == mark && board[5] == mark && board[8] == mark) ||
               (board[0] == mark && board[4] == mark && board[8] == mark) ||
               (board[2] == mark && board[4] == mark && board[6] == mark);
    }

    static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }
}