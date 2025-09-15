import java.util.Scanner;

public class TicTacToe {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] board = new String[9]; 

        int player = 1;
        int winner = 0;
        int moves = 0;
        fillBoard(board);
        drawBoard(board);
        
        while(winner == 0 && moves < 9) {
            moves++;
            makeMove(board, player);
            drawBoard(board); 
            winner = checkWinner(board, player);
            player = player % 2 + 1;
        }
        if(winner == 0) {
            System.out.println("Tie!!");
        } else {
            System.out.printf("Player %d wins!!", winner);
        }
    }

    private static int checkWinner(String[] board, int player) {
        String line = "";
        for(int i = 0; i < 8; i++)
        {
            switch(i) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if(line.equals("XXX")) return 1;
            if(line.equals("OOO")) return 2;
        }
        return 0;	
    }

    private static void makeMove(String[] board, int player) {
        String marker = "X";
        if (player == 2) marker = "O";

        System.out.printf("Player %d here would you like to go? (1-9): ", player);
        int move = input.nextInt() - 1;
        if(move >= 0 && move < 9) {
            board[move] = marker;
        }
    }

    private static void drawBoard(String[] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row * 3 + col]);
                if (col < 2) System.out.print(" | "); 
            }
            System.out.println(); 
            if (row < 2) {
                System.out.println("---------"); 
            }
        }
    }

    private static void fillBoard(String[] board) {
        for (int i = 0; i < 9; i++) {
            board[i] = Integer.toString(i + 1);
        }
    }
}

            
            
