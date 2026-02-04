import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String input = scanner.nextLine();
        
        char[] buffer = new char[10]; // Buffer of size 10
        
        // Copy user input into buffer without proper bounds checking
        for (int i = 0; i < input.length(); i++) {
            buffer[i] = input.charAt(i);
        }
        
        System.out.println("User input copied into buffer: " + new String(buffer));
    }
}
