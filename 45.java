import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] buffer = new char[10];
        
        // This code snippet does not check the length of the input before copying it into the buffer,
        // potentially causing a buffer overflow vulnerability.
        input.getChars(0, input.length(), buffer, 0);
        
        System.out.println("Buffer content: " + new String(buffer));
        
        scanner.close();
    }
}
