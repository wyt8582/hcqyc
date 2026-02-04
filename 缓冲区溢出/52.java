import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        char[] buffer = new char[10];
        int len = Math.min(name.length(), buffer.length);
        
        // Copy user input into the buffer without proper bounds checking
        name.getChars(0, len, buffer, 0);
        
        System.out.println("Hello, " + new String(buffer));
    }
}
