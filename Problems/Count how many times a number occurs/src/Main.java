import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arr = scanner.nextInt();
        int[] array = new int[arr];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }
        int number = scanner.nextInt();
        for (int i : array) {
            if (i == number) {
                count++;
            }
        }
        System.out.println(count);
    }
}