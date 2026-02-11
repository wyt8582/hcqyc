import java.util.Scanner;

public class BufferOverflowVulnerabilityExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        // Vulnerable code - allocating fixed size array without properly validating input size
        char[] buffer = new char[10];
        userInput.getChars(0, userInput.length(), buffer, 0);

        System.out.println("Input: " + new String(buffer));

    }
}
