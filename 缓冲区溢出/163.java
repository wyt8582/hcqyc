import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create a fixed size byte array
        byte[] buffer = new byte[10];
        
        // Copy the user input into the buffer without proper bounds checking
        System.arraycopy(input.getBytes(), 0, buffer, 0, input.length());

        // Print out the content of the buffer
        System.out.println("Buffer content: " + new String(buffer));
    }
}
