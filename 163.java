import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String userInput = scanner.nextLine();
        
        // Vulnerability: Improperly handling user input can lead to buffer overflow
        char[] buffer = new char[10];
        userInput.getChars(0, userInput.length(), buffer, 0);
        
        System.out.println("Welcome, " + new String(buffer));
    }
}
