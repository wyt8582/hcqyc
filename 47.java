import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Assuming the buffer size is fixed to 10 characters
        char[] buffer = new char[10];
        
        // Copy the user input into the buffer without proper validation
        for (int i = 0; i < userInput.length(); i++) {
            buffer[i] = userInput.charAt(i);
        }

        System.out.println("Buffer overflow vulnerability exploited successfully!");
    }
}
