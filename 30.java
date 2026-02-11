import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        
        String userInput = scanner.nextLine();
        char[] buffer = new char[10]; // Buffer size is limited to 10 characters
        
        // Copy user input into the buffer without proper length checking
        userInput.getChars(0, userInput.length(), buffer, 0);
        
        System.out.println("Hello, " + new String(buffer));
    }
}
