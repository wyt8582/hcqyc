import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userInput = scanner.nextLine();

        // This code snippet is vulnerable to buffer overflow
        char[] buffer = new char[10];
        userInput.getChars(0, userInput.length(), buffer, 0);

        System.out.println("Hello, " + String.valueOf(buffer));
    }
}
