package arrays.theory.immutable_version;

import java.util.Arrays;

public class CustomImmutableArray<T> {
    private final T[] array;

    public CustomImmutableArray(T[] array) {
        // Make a defensive copy to prevent external modification of the original array
        this.array = Arrays.copyOf(array, array.length);
    }

    public T get(int index) {
        return array[index];
    }

    public int length() {
        return array.length;
    }

    // No setter methods are provided
}