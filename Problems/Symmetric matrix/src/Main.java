import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        boolean state = false;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] =  scanner.nextInt();
            }
        }
        for (int k = 0; k < size && !state; k++) {
            for (int l = 0; l < size; l++) {
                if (matrix[k][l] != matrix[l][k]) {
                    state = true;
                    break;
                }
            }
        }
        if (state) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}