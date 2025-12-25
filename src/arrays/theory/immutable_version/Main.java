package arrays.theory.immutable_version;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = new Integer[1];
        arr[0] = 100;

        CustomImmutableArray<Integer> immutableArray = new CustomImmutableArray<>(arr);
        System.out.println(immutableArray.get(0));
    }
}
