import java.util.Scanner;

public class BufferOverflowExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Vulnerable code - concatenating user input to a fixed size buffer
        String fixedSizeBuffer = "Fixed size buffer ";
        fixedSizeBuffer += userInput;

        System.out.println("Resulting string: " + fixedSizeBuffer);
    }
}
