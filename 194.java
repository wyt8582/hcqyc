import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        
        String input = scanner.nextLine();
        char[] buffer = new char[10]; // Buffer of size 10
        
        // Copy user input into the buffer
        for (int i = 0; i < input.length(); i++) {
            buffer[i] = input.charAt(i);
        }
        
        System.out.println("Input successfully copied into buffer.");
    }
}
