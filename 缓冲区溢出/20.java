import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Create a fixed size character array with length 10
        char[] buffer = new char[10];
        
        // Copy the user input into the fixed size buffer without proper bounds checking
        for (int i = 0; i < name.length(); i++) {
            buffer[i] = name.charAt(i);
        }
        
        // Print out the contents of the buffer
        System.out.println("Buffer content: " + new String(buffer));
    }
}
