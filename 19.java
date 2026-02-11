import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        char[] buffer = new char[10];
        int i;

        for (i = 0; i < name.length(); i++) {
            buffer[i] = name.charAt(i);
        }

        // Vulnerability: No bounds checking on user input
        System.out.println("Hello, " + new String(buffer));

        scanner.close();
    }
}
