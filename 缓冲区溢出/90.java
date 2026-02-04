import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Creating a fixed-size array with a buffer size of 10
        char[] buffer = new char[10];
        
        // Copying the user input into the fixed-size buffer without proper bounds checking
        for (int i = 0; i < name.length(); i++) {
            buffer[i] = name.charAt(i);
        }
        
        System.out.println("Your name is: " + new String(buffer));
    }
}
