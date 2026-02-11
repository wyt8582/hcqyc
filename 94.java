import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        char[] buffer = new char[10];
        input.getChars(0, input.length(), buffer, 0);
        
        // Simulating buffer overflow vulnerability by printing beyond the allocated size of the buffer
        for (int i = 0; i < 15; i++) {
            System.out.print(buffer[i]);
        }
        
        scanner.close();
    }
}
