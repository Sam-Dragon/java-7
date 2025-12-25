package strings.programs;

import java.util.Scanner;
import java.util.Stack;

public class ReverseTheWordsOrderOfString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input ?");
        String input = scanner.nextLine();
        System.out.println("Input String :: " + input);

        String reversedString = reverseTheWordsOfString(input);
        System.out.println("Reversed Words Of String :: " + reversedString);
    }

    private static String reverseTheWordsOfString(String input) {
        Stack<String> stack = new Stack<>();

        String[] arr = input.split(" ");
        for (String ele : arr) {
            stack.push(ele);
        }

        StringBuilder reverseTheWordsOfString = new StringBuilder();
        while (!stack.isEmpty()) {
            String element = stack.pop();
            reverseTheWordsOfString.append(element)
                                   .append(" ");
        }

        return reverseTheWordsOfString.toString()
                                      .trim();
    }

}
