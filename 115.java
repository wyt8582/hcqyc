import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        char[] buffer = new char[10];
        
        // Copy user input into the buffer without proper bounds checking
        for (int i = 0; i < userInput.length(); i++) {
            buffer[i] = userInput.charAt(i);
        }
        
        // Vulnerability: If user input length exceeds the size of the buffer, buffer overflow can occur
        
        System.out.println("Input successfully stored in buffer.");
    }
}
