import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        char[] buffer = new char[10]; // Buffer with fixed size
        
        // Copy user input into buffer without checking length
        userInput.getChars(0, userInput.length(), buffer, 0);
        
        System.out.println("User input copied into buffer: " + new String(buffer));
    }
}
