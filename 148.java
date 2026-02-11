import java.util.Scanner;

public class BufferOverflowExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.next();
        
        // Create a fixed-size buffer with 10 characters
        char[] buffer = new char[10];
        
        // Copy user input into the buffer without checking length
        userInput.getChars(0, userInput.length(), buffer, 0);
        
        System.out.println("Buffer content: " + new String(buffer));
    }
}
