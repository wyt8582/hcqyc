import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = scanner.next();
        
        char[] buffer = new char[10];
        
        // Copy user input into buffer without checking input length
        userInput.getChars(0, userInput.length(), buffer, 0);
        
        System.out.println("Buffer content: " + new String(buffer));
    }
}
