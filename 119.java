import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Creating a fixed size array with buffer size 10
        char[] buffer = new char[10];

        // Copying the user input into the buffer without proper length validation
        input.getChars(0, input.length(), buffer, 0);

        System.out.println("Buffer contents: " + new String(buffer));

        scanner.close();
    }
}
