import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Creating a buffer of fixed size
        char[] buffer = new char[10];
        
        // Copying user input into the buffer without proper validation
        input.getChars(0, input.length(), buffer, 0);
        
        System.out.println("Buffer overflow vulnerability exploited successfully!");
    }
}
