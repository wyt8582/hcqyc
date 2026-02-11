import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char[] buffer = new char[10];
        
        // This code snippet tries to copy user input into a fixed size buffer without checking the length
        // This can lead to a buffer overflow vulnerability
        for (int i = 0; i < input.length(); i++) {
            buffer[i] = input.charAt(i);
        }
        
        System.out.println("Input copied successfully.");
    }
}
