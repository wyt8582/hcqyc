import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        // Creating a fixed-size char array with size 10
        char[] buffer = new char[10];

        // Copying user input into the buffer array without checking the length
        userInput.getChars(0, userInput.length(), buffer, 0);

        System.out.println("Buffer content: " + new String(buffer));

        scanner.close();
    }
}
