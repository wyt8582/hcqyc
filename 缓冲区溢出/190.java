import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Vulnerable code - allocating fixed size buffer for storing the user input
        byte[] buffer = new byte[10];
        
        System.out.println("Welcome, " + new String(buffer));
    }
}
