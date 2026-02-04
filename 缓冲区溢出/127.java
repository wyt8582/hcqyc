import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Vulnerability: Improper handling of user input without length validation
        char[] buffer = new char[10];
        name.getChars(0, name.length(), buffer, 0);

        System.out.println("Welcome, " + new String(buffer));
    }
}
