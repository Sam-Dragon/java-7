package strings.programs;

import java.util.Optional;
import java.util.Scanner;

public class ReverseTheString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input ?");
        String input = scanner.nextLine();
        System.out.println("Input String :: " + input);

        String reversedString = reverseTheString(input);
        System.out.println("Reversed String :: " + reversedString);
    }

    private static String reverseTheString(String input) {
        // NOT GOOD PRACTICE
        /*return Optional.ofNullable(input)
                       .map(StringBuilder::new)
                       .map(StringBuilder::reverse)
                       .map(StringBuilder::toString)
                       .orElse("");*/

        return new StringBuilder(input).reverse()
                                       .toString();
    }

}
