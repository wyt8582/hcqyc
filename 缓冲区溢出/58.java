import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = scanner.next();
        
        // Vulnerable code - allocating fixed size buffer
        char[] buffer = new char[10];
        
        // Copy user input into the buffer without proper bounds checking
        input.getChars(0, input.length(), buffer, 0);
        
        System.out.println("Hello, " + new String(buffer));
    }
}
