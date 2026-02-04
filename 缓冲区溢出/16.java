import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        // Vulnerable code - inadequate input validation leading to buffer overflow
        char[] buffer = new char[10];
        int length = Math.min(input.length(), buffer.length);
        
        for (int i = 0; i < length; i++) {
            buffer[i] = input.charAt(i);
        }
        
        System.out.println("Buffer contents: " + new String(buffer));
    }
}
