import java.util.Scanner;

public class TicTacToe {
    static char[][] board = {
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '}
    };
    static char[][] gameBoard = new char[3][3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = ' ';
            }
        }
        char currentPlayer = 'X';
        boolean gameEnded = false;
        while (!gameEnded) {
            printBoard();
            System.out.print("Player "+currentPlayer+", enter your move (row[1-3] and column[1-3]): ");
            int row = sc.nextInt()-1;
            int col = sc.nextInt()-1;
            if (row<0 || col<0 || row>=3 || col>=3 || gameBoard[row][col]!=' ') {
                System.out.println("Invalid move. Try again.");
                continue;
            }
            gameBoard[row][col] = currentPlayer;
            updateBoard();
            if (checkWinner(currentPlayer)) {
                printBoard();
                System.out.println("Player "+currentPlayer+" wins!");
                gameEnded = true;
            } 
            else if (isDraw()) {
                printBoard();
                System.out.println("It's a draw!");
                gameEnded = true;
            } 
            else
                currentPlayer = (currentPlayer=='X')?'O':'X';
        }
        sc.close();
    }

    static void updateBoard() {
        board[0][0] = gameBoard[0][0]; board[0][2] = gameBoard[0][1]; board[0][4] = gameBoard[0][2];
        board[2][0] = gameBoard[1][0]; board[2][2] = gameBoard[1][1]; board[2][4] = gameBoard[1][2];
        board[4][0] = gameBoard[2][0]; board[4][2] = gameBoard[2][1]; board[4][4] = gameBoard[2][2];
    }

    static void printBoard() {
        System.out.println();
        for (int i=0; i<board.length; i++) {
            System.out.print("\t");
            for (int j=0; j<board[i].length; j++) {
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean checkWinner(char player) {
        for (int i=0; i<3; i++) {
            if (gameBoard[i][0]==player && gameBoard[i][1]==player && gameBoard[i][2]==player)
                return true;
            if (gameBoard[0][i]==player && gameBoard[1][i]==player && gameBoard[2][i]==player)
                return true;
        }
        if (gameBoard[0][0]==player && gameBoard[1][1]==player && gameBoard[2][2]==player)
            return true;
        if (gameBoard[0][2]==player && gameBoard[1][1]==player && gameBoard[2][0]==player)
            return true;
        return false;
    }

    static boolean isDraw() {
        for (int i=0; i<3; i++)
            for (int j=0; j<3; j++)
                if (gameBoard[i][j]==' ')
                    return false;
        return true;
    }
}
