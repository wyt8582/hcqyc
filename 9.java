import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        
        char[] buffer = new char[10]; // Buffer with fixed size of 10
        
        // Copy the user input into the buffer without checking the length
        name.getChars(0, name.length(), buffer, 0);
        
        System.out.println("Hello, " + new String(buffer));
    }
}
