import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        char[] buffer = new char[10];
        
        // Vulnerability: User input is not properly validated and may cause buffer overflow
        if (name.length() <= 10) {
            name.getChars(0, name.length(), buffer, 0);
            System.out.println("Hello, " + new String(buffer));
        } else {
            System.out.println("Input too long!");
        }

        scanner.close();
    }
}
