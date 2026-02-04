import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        // Creating a fixed size array with length of 10
        char[] buffer = new char[10];
        
        // Copying the user input into the buffer array
        userInput.getChars(0, userInput.length(), buffer, 0);

        System.out.println("Buffer contents: " + new String(buffer));
    }
}
