import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        // Creating a fixed-size buffer
        char[] buffer = new char[10];
        
        // Copying user input into the buffer without proper bounds checking
        userInput.getChars(0, userInput.length(), buffer, 0);
        
        System.out.println("Buffer content: " + new String(buffer));
    }
}
