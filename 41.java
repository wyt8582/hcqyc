import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        // Assuming the input should not exceed 10 characters
        char[] buffer = new char[10];
        
        // Copy user input into the buffer without proper bounds checking
        userInput.getChars(0, userInput.length(), buffer, 0);
        
        System.out.println("Input successfully copied into buffer: " + new String(buffer));
    }
}
