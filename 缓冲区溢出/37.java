import java.util.Scanner;

public class BufferOverflowExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Define a fixed size buffer
        char[] buffer = new char[10];

        // Copy user input into the fixed size buffer without proper bounds checking
        input.getChars(0, input.length(), buffer, 0);

        // Print the contents of the buffer
        System.out.println("Buffer content: " + new String(buffer));

    }
}
