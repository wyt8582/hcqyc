import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Vulnerable code - allocating fixed size array without proper input validation
        char[] buffer = new char[10];
        
        // Copy user input into the buffer without checking input length
        name.getChars(0, name.length(), buffer, 0);

        System.out.println("Hello, " + new String(buffer));
    }
}
