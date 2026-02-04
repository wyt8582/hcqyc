import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String input = scanner.next();
        
        char[] buffer = new char[10];
        // Assuming user input can be larger than the allocated buffer size
        input.getChars(0, input.length(), buffer, 0);
        
        System.out.println("Welcome, " + String.valueOf(buffer));
    }
}
