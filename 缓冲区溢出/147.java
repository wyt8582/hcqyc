import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String input = scanner.nextLine();
        
        // Creating a fixed-size buffer with size 10
        char[] buffer = new char[10];
        
        // Copying the user input into the buffer without proper bounds checking
        for (int i = 0; i < input.length(); i++) {
            buffer[i] = input.charAt(i);
        }
        
        // Displaying the contents of the buffer
        System.out.println("Buffer content: " + new String(buffer));
    }
}
