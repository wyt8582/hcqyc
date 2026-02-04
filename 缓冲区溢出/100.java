import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        char[] buffer = new char[10];
        
        // Copy user input into the buffer without proper length checking
        for (int i = 0; i < userInput.length(); i++) {
            buffer[i] = userInput.charAt(i);
        }

        System.out.println("Input successfully stored in the buffer: " + new String(buffer));

        // Perform some operation on the buffer (vulnerable to buffer overflow)
    }
}
