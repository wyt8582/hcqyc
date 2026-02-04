import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char[] buffer = new char[10];
        
        for (int i = 0; i < input.length(); i++) {
            buffer[i] = input.charAt(i); // Writing user input directly into the buffer without proper length check
        }
        
        System.out.println("Buffer contents: " + new String(buffer));
    }
}
