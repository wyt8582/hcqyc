import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        char[] buffer = new char[10]; // Buffer size is fixed at 10

        // Copy user input into the buffer
        userInput.getChars(0, userInput.length(), buffer, 0);

        System.out.println("Buffer contents: " + new String(buffer));

        scanner.close();
    }
}
