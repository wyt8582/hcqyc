import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String userInput = scanner.nextLine();
        
        // Vulnerable code: Creating a fixed-size buffer
        byte[] buffer = new byte[10];
        
        // Copying user input into the buffer without proper bounds checking
        System.arraycopy(userInput.getBytes(), 0, buffer, 0, userInput.length());
        
        System.out.println("Buffer contents: " + new String(buffer));
    }
}
