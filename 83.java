import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] buffer = new char[10];
        int length = Math.min(input.length(), buffer.length);
        
        // Copy input string into buffer without proper bounds checking
        for (int i = 0; i < length; i++) {
            buffer[i] = input.charAt(i);
        }

        System.out.println("Buffer content: " + new String(buffer));
    }
}
