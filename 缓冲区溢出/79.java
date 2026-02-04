import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.next();
        
        // Creating a fixed size buffer with a capacity of 10 characters
        char[] buffer = new char[10];
        
        // Copying the user input into the buffer without proper bounds checking
        for (int i = 0; i < name.length(); i++) {
            buffer[i] = name.charAt(i);
        }
        
        // Accessing an index beyond the size of the buffer, leading to buffer overflow
        System.out.println("Hello, " + buffer[10]);
    }
}
