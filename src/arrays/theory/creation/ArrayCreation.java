package arrays.theory.creation;

public class ArrayCreation {

    public static void main(String[] args) {

        System.out.println("Creation >> Dynamic Array");
        int[] dynamicArray = {1, 2, 3};
        iterateAndPrint(dynamicArray);

        System.out.println("Creation >> Sized Object Array");
        int[] sizedObjectArray = new int[3];
        sizedObjectArray[0] = 1;
        sizedObjectArray[1] = 2;
        sizedObjectArray[2] = 3;
        iterateAndPrint(sizedObjectArray);

        System.out.println("Creation >> Dynamic Object Array");
        int[] dynamicObjectArray = {1, 2, 3};
        iterateAndPrint(dynamicObjectArray);
    }

    private static void iterateAndPrint(int[] dynamicArray) {
        for (int i = 0; i < dynamicArray.length; i++) {
            System.out.println(dynamicArray[i]);
        }
    }
}
