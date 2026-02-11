import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.next();
        
        // Assuming the user enters a name longer than 10 characters
        char[] buffer = new char[10];
        
        // Copy the user input into the buffer without proper bounds checking
        for (int i = 0; i < name.length(); i++) {
            buffer[i] = name.charAt(i);
        }
        
        System.out.println("Hello, " + String.valueOf(buffer));
    }
}
