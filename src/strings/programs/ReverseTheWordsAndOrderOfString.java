package strings.programs;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseTheWordsAndOrderOfString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input ?");
        String input = scanner.nextLine();
        System.out.println("Input String :: " + input);

        String reversedString = reverseTheWordsOfString(input);
        System.out.println("Reversed Words Of String :: " + reversedString);
    }

    private static String reverseTheWordsOfString(String input) {
        return Arrays.stream(input.split(" "))
                     .map(StringBuilder::new)
                     .map(StringBuilder::reverse)
                     .map(StringBuilder::toString)
                     .collect(Collectors.joining(" "));
    }

}
