import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char[] buffer = new char[10];
        int length = Math.min(input.length(), buffer.length);
        
        // Copy the input string into the buffer without proper boundary checking
        for (int i = 0; i < length; i++) {
            buffer[i] = input.charAt(i);
        }
        
        // This code does not check if the length of the input exceeds the size of the buffer
    }
}
