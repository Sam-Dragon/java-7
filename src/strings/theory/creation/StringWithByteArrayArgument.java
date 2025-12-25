package strings.theory.creation;

public class StringWithByteArrayArgument {

    public static void main(String[] args) {
        byte[] array = new byte[]{'W', 'E', 'L', 'C', 'O', 'M', 'E'};
        String s = new String(array);

        System.out.println("String s = " + s);
    }

}
