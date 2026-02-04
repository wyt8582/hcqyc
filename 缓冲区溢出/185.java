import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Vulnerability: Improper handling of user input without validating input length
        byte[] buffer = new byte[10];
        System.arraycopy(name.getBytes(), 0, buffer, 0, name.length());
        
        System.out.println("Hello, " + new String(buffer));
    }
}
