import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.next();

        // Vulnerability: If the user enters a very long input, it can cause a buffer overflow
        char[] buffer = new char[10];
        name.getChars(0, name.length(), buffer, 0);

        System.out.println("Hello, " + String.valueOf(buffer));
    }
}
