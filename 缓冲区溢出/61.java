import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        char[] buffer = new char[10]; // Buffer size is limited to 10 characters
        
        userInput.getChars(0, userInput.length(), buffer, 0); // Copy user input into buffer
        
        System.out.println("Buffer contents: " + new String(buffer));
    }
}
