package arrays.programs;

public class BubbleSortOnInputArray {

    private static void iterateAndPrint(int[] dynamicArray) {
        for (int i = 0; i < dynamicArray.length; i++) {
            System.out.print(dynamicArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] array = {22, 32, 87, 64, 38, 45, 68, 12};
        System.out.println("Input Array");
        iterateAndPrint(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array");
        iterateAndPrint(array);
    }
}
