import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Vulnerable code: allocating a fixed-size array without proper input validation
        byte[] buffer = new byte[10];
        
        // Copying user input into the buffer without checking its length
        System.arraycopy(name.getBytes(), 0, buffer, 0, name.length());
        
        System.out.println("Hello, " + new String(buffer));
    }
}
