import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = scanner.next();

        // Vulnerable code - No length validation on input
        byte[] buffer = new byte[10];
        System.arraycopy(input.getBytes(), 0, buffer, 0, input.length());
        
        System.out.println("Hello, " + new String(buffer));
    }
}
