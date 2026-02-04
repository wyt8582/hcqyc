import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        char[] buffer = new char[10];
        
        // Vulnerability: No validation on the length of user input
        userInput.getChars(0, userInput.length(), buffer, 0);
        
        System.out.println("Buffer contents: " + new String(buffer));
    }
}
