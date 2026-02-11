import java.util.Scanner;

public class BufferOverflowExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] buffer = new char[10]; // Buffer with fixed size

        // Copy the user input into the buffer without checking the length
        input.getChars(0, input.length(), buffer, 0);

        System.out.println("Buffer contents: " + new String(buffer));
    }
}
