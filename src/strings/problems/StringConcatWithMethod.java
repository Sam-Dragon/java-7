package strings.problems;

public class StringConcatWithMethod {

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
        String s3 = s1.concat(s2);
        System.out.println(s1 + ".concat( " + s2 + " ) = " + s3);
    }

    private static void nullWithString(String s2, String s1) {
        String s3 = s2.concat(s1);
        System.out.println(s2 + ".concat( " + s1 + " ) = " + s3);
    }

}
