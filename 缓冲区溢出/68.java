import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = scanner.next();
        
        char[] buffer = new char[10];
        
        // Vulnerable code - buffer overflow can occur if the user input exceeds the size of the buffer
        userInput.getChars(0, userInput.length(), buffer, 0);
        
        System.out.println("Buffer contents: " + new String(buffer));
    }
}
