import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userInput = scanner.nextLine();

        // Vulnerability: No input validation or size checking on userInput
        byte[] buffer = new byte[10];
        buffer = userInput.getBytes();

        System.out.println("Hello, " + new String(buffer));
    }
}
