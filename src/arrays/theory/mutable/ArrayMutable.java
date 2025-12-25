package arrays.theory.mutable;

public class ArrayMutable {

    public static void main(String[] args) {
        int[] array = new int[1];
        array[0] = 10;
        System.out.println("Actual Array");
        iterateAndPrint(array);

        System.out.println("Updated Array");
        mutableArray(array);
        iterateAndPrint(array);
    }

    private static void mutableArray(int[] array) {
        array[0] = 999;
    }

    private static void iterateAndPrint(int[] dynamicArray) {
        for (int i = 0; i < dynamicArray.length; i++) {
            System.out.println(dynamicArray[i]);
        }
    }
}
