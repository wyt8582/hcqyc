import java.util.Scanner;

public class BufferOverflowExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        // Vulnerability: Using userInput directly without checking its length
        byte[] buffer = new byte[10];
        System.arraycopy(userInput.getBytes(), 0, buffer, 0, userInput.length());

        System.out.println("User input: " + new String(buffer));
    }
}
