import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = scanner.next();

        // Vulnerable code - using an array with fixed size without proper input validation
        char[] buffer = new char[10];
        
        // Copying user input into the buffer without checking the length
        for (int i = 0; i < input.length(); i++) {
            buffer[i] = input.charAt(i);
        }

        System.out.println("Your name is: " + new String(buffer));
    }
}
