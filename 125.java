import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        char[] buffer = new char[10];
        userInput.getChars(0, userInput.length(), buffer, 0);
        
        System.out.println("Buffer content: " + new String(buffer));
        
        // This is where the vulnerability occurs
        // If the user input length is greater than the buffer size (10), it will result in a buffer overflow
    }
}
