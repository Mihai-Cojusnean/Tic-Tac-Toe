class Main {
    public static void main(String[] args) {
        // put your code here
        int[][][] cubic = new int[3][4][5]; // a three-dimensional array (cube)

        int current = 1; // it stores a value to fill elements

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    cubic[i][j][k] = current;
                }
            }
            current++;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(cubic[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}