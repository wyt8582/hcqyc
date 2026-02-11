import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.next();
        
        // Vulnerability: Not checking input size before using it to create a fixed-size buffer
        byte[] buffer = new byte[10];
        System.arraycopy(name.getBytes(), 0, buffer, 0, name.length());
        
        System.out.println("Buffer content: " + new String(buffer));
        
        scanner.close();
    }
}
