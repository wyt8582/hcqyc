import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String userInput = scanner.nextLine();
        
        // Vulnerable code - not checking the length of user input
        byte[] buffer = new byte[10];
        System.arraycopy(userInput.getBytes(), 0, buffer, 0, userInput.length());
        
        System.out.println("Welcome, " + new String(buffer));
    }
}
