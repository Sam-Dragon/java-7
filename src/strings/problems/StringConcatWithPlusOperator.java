package strings.problems;

public class StringConcatWithPlusOperator {

    public static void main(String[] args) {
        String s1 = "String";
        String s2 = null;

        try {
            nullWithString(s2, s1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            stringWithNull(s1, s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void stringWithNull(String s1, String s2) {
        String s4 = s1 + s2;
        System.out.println(s1 + " + " + s2 + " = " + s4);
    }

    private static void nullWithString(String s2, String s1) {
        String s4 = s2 + s1;
        System.out.println(s2 + " + " + s1 + " = " + s4);
    }
}
