import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.next();
        
        // Assuming the name length should not exceed 10 characters
        char[] buffer = new char[10];
        
        // Copy the user input into the buffer without checking its length
        name.getChars(0, name.length(), buffer, 0);
        
        System.out.println("Hello, " + String.valueOf(buffer));
    }
}
