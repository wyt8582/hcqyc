import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Creating a fixed-size array
        char[] buffer = new char[10];

        // Copying user input into the fixed-size array without proper bounds checking
        for (int i = 0; i < userInput.length(); i++) {
            buffer[i] = userInput.charAt(i);
        }

        // Vulnerability: If the user input length exceeds the size of the buffer (10), it will cause buffer overflow
    }
}
