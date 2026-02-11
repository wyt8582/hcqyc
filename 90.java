import java.util.Scanner;

public class BufferOverflowExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        char[] buffer = new char[10];
        
        // Vulnerability: No bounds checking on the user input length
        for (int i = 0; i < userInput.length(); i++) {
            buffer[i] = userInput.charAt(i);
        }
        
        System.out.println("Buffer overflow successful!");
    }
}
