import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        // Create a fixed-size buffer
        char[] buffer = new char[10];
        
        // Copy user input into the buffer without proper bounds checking
        for (int i = 0; i < userInput.length(); i++) {
            buffer[i] = userInput.charAt(i);
        }
        
        // Print out the contents of the buffer
        System.out.println("Buffer contents: " + new String(buffer));
    }
}
