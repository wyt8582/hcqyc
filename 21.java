import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String input = scanner.next();
        
        char[] buffer = new char[10]; // Buffer size is limited to 10 characters
        
        for (int i = 0; i < input.length(); i++) {
            buffer[i] = input.charAt(i);
        }
        
        System.out.println("Hello, " + new String(buffer));
    }
}
