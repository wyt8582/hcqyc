import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.next();
        
        char[] buffer = new char[10];
        // Simulating a buffer overflow by copying user input directly into the fixed-size buffer
        name.getChars(0, name.length(), buffer, 0);
        
        System.out.println("Hello, " + new String(buffer));
    }
}
