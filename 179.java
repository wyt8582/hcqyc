import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String input = scanner.nextLine();

        // Vulnerability: Buffer Overflow can occur if the input size exceeds the allocated buffer size
        char[] buffer = new char[10];
        input.getChars(0, input.length(), buffer, 0);

        System.out.println("Hello, " + String.valueOf(buffer));
    }
}
