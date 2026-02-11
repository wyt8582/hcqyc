import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        char[] buffer = new char[10];
        int length = Math.min(name.length(), buffer.length);
        
        // Copy the user input into the buffer
        for (int i = 0; i < length; i++) {
            buffer[i] = name.charAt(i);
        }
        
        System.out.println("Hello, " + new String(buffer));
    }
}
