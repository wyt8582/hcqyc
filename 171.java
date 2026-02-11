import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char[] buffer = new char[10]; // Fixed size buffer
        
        // Copy user input into the fixed size buffer without proper bounds checking
        for (int i = 0; i < input.length(); i++) {
            buffer[i] = input.charAt(i);
        }
        
        // Accessing index beyond the bounds of the buffer
        System.out.println("Buffer content: " + new String(buffer));
        
        scanner.close();
    }
}
