import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int size = n * n;

        int[][] sudoku = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sudoku[i][j] = scanner.nextInt();
            }
        }

        if (rowControl(sudoku, size) &&
                columnControl(sudoku, size)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean rowControl(int[][] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 1; k < size; k++) {
                    if (array[i][j] == array[i][k] && j != k) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean columnControl(int[][] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 1; k < size; k++) {
                    if (array[j][i] == array[k][i] && j != k) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}