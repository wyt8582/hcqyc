import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Creating a fixed-size buffer of 10 characters
        char[] buffer = new char[10];

        // Copying the user input into the buffer without proper bounds checking
        for (int i = 0; i < input.length(); i++) {
            buffer[i] = input.charAt(i);
        }

        System.out.println("Buffer overflow vulnerability exploited successfully.");
    }
}
