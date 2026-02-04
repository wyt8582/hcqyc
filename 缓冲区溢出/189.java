import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        char[] buffer = new char[10]; // Buffer size is limited to 10 characters
        
        input.getChars(0, input.length(), buffer, 0); // Copy user input into buffer
        
        System.out.println("Buffer content: " + new String(buffer));
        
        scanner.close();
    }
}
