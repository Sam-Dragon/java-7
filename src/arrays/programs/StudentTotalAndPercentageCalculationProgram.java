package arrays.programs;

import java.util.Scanner;

public class StudentTotalAndPercentageCalculationProgram {

    public static void main(String[] args) {
        int total = 0;
        float percentage = 0.0f;

        System.out.println("Enter the Marks (space separated)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] stringArray = input.split(" ");
        int length = stringArray.length;

        for (int i = 0; i < length; i++) {
            total += Integer.parseInt(stringArray[i]);
        }

        if (length > 0) percentage = (float) total / length;

        System.out.println("Total Marks = " + total + " & Percentage = " + percentage);
    }
}
