import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        // Vulnerability: Improperly handling user input without length validation
        char[] buffer = new char[10]; // Buffer with fixed size of 10 characters
        
        userInput.getChars(0, userInput.length(), buffer, 0); // Copy user input to buffer
        
        System.out.println("Buffer contents: " + new String(buffer));
    }
}
