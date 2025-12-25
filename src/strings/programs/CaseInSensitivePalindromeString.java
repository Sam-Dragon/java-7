package strings.programs;

import java.util.Optional;
import java.util.Scanner;

public class CaseInSensitivePalindromeString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input ?");
        String input = scanner.nextLine();
        System.out.println("Input String :: " + input);

        String reversedString = reverseTheString(input.toLowerCase());
        System.out.println("Reversed String :: " + reversedString);

        System.out.println(
                input + " == " + reversedString + " is palindrome ? " + (input.equalsIgnoreCase(reversedString)));
    }

    private static String reverseTheString(String input) {
        return Optional.ofNullable(input)
                       .map(StringBuilder::new)
                       .map(StringBuilder::reverse)
                       .map(StringBuilder::toString)
                       .orElse("");
    }

}
