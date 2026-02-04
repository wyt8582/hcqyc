import java.util.Scanner;

public class BufferOverflowVulnerabilityExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        char[] buffer = new char[10]; // Buffer of fixed size

        // Copy user input into the buffer without proper bounds checking
        userInput.getChars(0, userInput.length(), buffer, 0);

        System.out.println("Buffer contents: " + new String(buffer));

        scanner.close();
    }
}
