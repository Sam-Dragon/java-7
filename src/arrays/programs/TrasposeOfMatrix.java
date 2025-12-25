package arrays.programs;

public class TrasposeOfMatrix {

    private static void iterateAndPrint(int[][] dynamicArray) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(dynamicArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        iterateAndPrint(array);

        System.out.println("Transpose of Matrix");
        transposeOfMatrix(array);
    }

    private static void transposeOfMatrix(int[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
