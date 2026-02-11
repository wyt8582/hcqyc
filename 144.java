import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        char[] buffer = new char[10];
        
        // Simulating buffer overflow vulnerability
        for (int i = 0; i <= input.length(); i++) {
            buffer[i] = input.charAt(i);
        }
        
        System.out.println("Buffer content: " + new String(buffer));
    }
}
