import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Vulnerable code that does not properly handle user input
        char[] buffer = new char[10];
        userInput.getChars(0, userInput.length(), buffer, 0);

        System.out.println("Input processed successfully.");
    }
}
