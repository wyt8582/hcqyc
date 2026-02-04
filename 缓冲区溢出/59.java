import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Vulnerable code - no input length validation
        char[] buffer = new char[10];
        name.getChars(0, name.length(), buffer, 0);

        System.out.println("Hello, " + new String(buffer));
    }
}
