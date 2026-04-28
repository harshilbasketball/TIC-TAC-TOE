public class UC6{

    static char[][] board = new char[3][3];

    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    static void placeMove(int row, int col, char symbol) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            board[row][col] = symbol;
        } else {
            System.out.println("Invalid move!");
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

    public static void main(String[] args) {
        initializeBoard();
        placeMove(0, 0, 'X');
        placeMove(1, 1, 'O');
        printBoard();
    }
}