import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        char[] buffer = new char[10];
        
        // Copy user input into buffer without checking bounds
        for (int i = 0; i < input.length(); i++) {
            buffer[i] = input.charAt(i);
        }
        
        System.out.println("Buffer overflow vulnerability exploited successfully!");
    }
}
