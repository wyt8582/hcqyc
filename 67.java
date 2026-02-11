import java.util.Scanner;

public class BufferOverflowExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Creating a fixed-size buffer of 10 characters
        char[] buffer = new char[10];

        // Copying user input into the buffer without checking its length
        userInput.getChars(0, userInput.length(), buffer, 0);

        System.out.println("Buffer contents: " + new String(buffer));

        scanner.close();
    }
}
