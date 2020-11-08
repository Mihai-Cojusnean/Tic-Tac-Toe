package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] board = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = " ";
            }
        }
        showResults(board);
        move(scanner, board);
    }

    public static void move(Scanner scanner, String[][] board) {
        int whosNext = 0;
        int count = 0;
        boolean status = false;
        while (!status) {
            System.out.println("Enter the coordinates:");
            String positionX = scanner.next();
            String positionY = scanner.next();
            if ((positionX.matches("\\d+")) && (positionY.matches("\\d+"))) {
                int x = Integer.parseInt(positionX);
                int y = Integer.parseInt(positionY);
                if (x < 4 && y < 4) {
                    if (board[3 - y][x - 1].equals(" ")) {
                        if (whosNext % 2 == 0) {
                            board[3 - y][x - 1] = "X";
                        } else {
                            board[3 - y][x - 1] = "O";
                        }
                        showResults(board);
                        whosNext++;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                } else {
                    System.out.println("Coordinates should be from 1 to 3!");
                }
            } else {
                System.out.println("You should enter numbers!");
            }
            if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals(" ")) {
                System.out.println(board[0][2] + " wins");
                status = true;
            } else if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals(" ")) {
                System.out.println(board[0][0] + " wins");
                status = true;
            }

            for (int i = 0; i < 3; i++) {
                if (board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2]) && !board[i][0].equals(" ")) {
                    System.out.println(board[i][0] + " wins");
                    status = true;
                    break;
                }
                if (board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i]) && !board[0][i].equals(" ")) {
                    System.out.println(board[0][i] + " wins");
                    status = true;
                }
            }

            if ((count == 45) && !status) {
                System.out.println("Draw");
                status = true;
            }
            count++;
        }
    }

    private static void showResults(String[][] board) {
        String sb = "---------\n" +
                "| " + board[0][0] + " " + board[0][1] + " " + board[0][2] + " |\n" +
                "| " + board[1][0] + " " + board[1][1] + " " + board[1][2] + " |\n" +
                "| " + board[2][0] + " " + board[2][1] + " " + board[2][2] + " |\n" +
                "---------";
        System.out.println(sb);
    }
}