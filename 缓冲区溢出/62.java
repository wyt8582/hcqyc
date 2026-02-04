import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Creating a fixed-size array with a capacity of 10 characters
        char[] buffer = new char[10];
        
        // Copying the user input into the fixed-size buffer without proper bounds checking
        for (int i = 0; i < name.length(); i++) {
            buffer[i] = name.charAt(i);
        }
        
        System.out.println("Hello, " + new String(buffer));
    }
}
