package strings.creation;

public class StringWithCharacterArrayArgument {

    public static void main(String[] args) {
        char[] array = new char[]{'W', 'E', 'L', 'C', 'O', 'M', 'E'};
        String s = new String(array);

        System.out.println("String s = " + s);
    }

}
