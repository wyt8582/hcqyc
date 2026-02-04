import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Vulnerable code - creates a fixed size array without proper input validation
        byte[] buffer = new byte[10];
        buffer = name.getBytes();
        
        System.out.println("Hello, " + new String(buffer));
    }
}
