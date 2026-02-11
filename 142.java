import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = scanner.next();
        
        // Assume that the buffer size for storing the name is limited to 10 characters
        char[] buffer = new char[10];
        
        // Copy the user input into the buffer without proper bounds checking
        for (int i = 0; i < input.length(); i++) {
            buffer[i] = input.charAt(i);
        }
        
        // Display the contents of the buffer
        System.out.println("Name: " + new String(buffer));
    }
}
