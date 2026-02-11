import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String input = scanner.nextLine();
        
        char[] buffer = new char[10]; // Buffer with fixed size
        
        // Copy user input into buffer without checking the length
        input.getChars(0, input.length(), buffer, 0);
        
        System.out.println("Hello, " + new String(buffer));
    }
}
