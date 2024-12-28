package amazonWhiteboard;

import java.util.Scanner;

public class amazonWhiteboard {
    public String encode(String input) {
        // Check for null or empty input
        if (input == null || input.length() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        char[] inputChars = input.toCharArray();
        char prevChar = 0;
        int counter = 0;

        // Iterate over input
        for (char c : inputChars) {
            if (c == prevChar) {
                counter++;
            } else {
                if (prevChar != 0) {
                    sb.append(counter).append(prevChar);
                }
                prevChar = c;
                counter = 1;
            }
        }

        // Append the last character and its count
        sb.append(counter).append(prevChar);

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        amazonWhiteboard encoder = new amazonWhiteboard();

        System.out.println("Enter a string to encode (or type 'exit' to quit):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            }

            String encoded = encoder.encode(input);
            System.out.println("Encoded string: " + encoded);
            System.out.println("Enter another string to encode (or type 'exit' to quit):");
        }

        scanner.close();
    }
}
