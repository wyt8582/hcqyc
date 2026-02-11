import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String userInput = scanner.next();
        
        // Create a fixed-size buffer
        char[] buffer = new char[10];
        
        // Copy the user input into the buffer
        userInput.getChars(0, userInput.length(), buffer, 0);
        
        System.out.println("Welcome, " + new String(buffer));
    }
}
