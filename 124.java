import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.next(); // User input
        
        char[] buffer = new char[10]; // Buffer size of 10
        
        // Copy the user input into the buffer without proper bounds checking
        for (int i = 0; i < name.length(); i++) {
            buffer[i] = name.charAt(i);
        }
        
        System.out.println("Hello, " + new String(buffer));
    }
}
