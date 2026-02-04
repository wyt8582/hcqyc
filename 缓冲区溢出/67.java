import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char[] buffer = new char[10];
        int len = input.length();
        
        // Simulating buffer overflow vulnerability
        for (int i = 0; i <= len; i++) {
            buffer[i] = input.charAt(i);
        }
        
        System.out.println("Buffer overflow successful!");
    }
}
