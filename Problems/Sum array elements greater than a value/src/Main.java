import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arr = scanner.nextInt();
        int[] array = new int[arr];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }
        int number = scanner.nextInt();
        for (int j : array) {
            if (j > number) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}