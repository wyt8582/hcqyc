import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        char[] buffer = new char[10]; // Fixed size buffer
        
        // Copy the user input into the buffer without proper bounds checking
        for (int i = 0; i < input.length(); i++) {
            buffer[i] = input.charAt(i);
        }
        
        System.out.println("Buffer contents: " + String.valueOf(buffer));
    }
}
