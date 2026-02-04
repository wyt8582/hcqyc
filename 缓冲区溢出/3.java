import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        char[] buffer = new char[10];
        
        // Copy the user input into the buffer
        for (int i = 0; i < input.length(); i++) {
            buffer[i] = input.charAt(i);
        }
        
        // Vulnerability: No boundary check on buffer size
        System.out.println("User input copied into buffer: " + new String(buffer));
    }
}
