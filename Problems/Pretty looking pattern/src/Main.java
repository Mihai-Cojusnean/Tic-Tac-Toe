import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String[][] arr = new String[4][4];
        boolean state = false;

        for (int i = 0; i < arr.length; i++) {
            String a = scanner.nextLine();
            for (int j = 0; j < arr[i].length; j++) {
                String b = a.substring(j, j + 1);
                arr[i][j] = b;
            }
        }
        for (int i = 0; i < arr.length - 1 && !state; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                if ((arr[i][j].equals(arr[i + 1][j]) && (arr[i][j].equals(arr[i + 1][j + 1])) && (arr[i][j].equals(arr[i][j + 1])))) {
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