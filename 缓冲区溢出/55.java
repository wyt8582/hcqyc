import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Assume the 'name' input is stored in a fixed-size buffer
        char[] buffer = new char[10];
        
        // Copy the user input into the fixed-size buffer without proper bounds checking
        for (int i = 0; i < name.length(); i++) {
            buffer[i] = name.charAt(i);
        }

        System.out.println("Hello, " + new String(buffer));
    }
}
