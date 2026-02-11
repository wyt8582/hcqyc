import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char[] buffer = new char[10];
        
        // Copy the user input into the buffer without proper bounds checking
        for (int i = 0; i < input.length(); i++) {
            buffer[i] = input.charAt(i);
        }
        
        // Vulnerability: User input length may exceed the buffer size, causing buffer overflow
    }
}
