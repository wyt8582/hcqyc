import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char[] buffer = new char[10];
        int length = input.length();
        
        for (int i = 0; i <= length; i++) {
            buffer[i] = input.charAt(i); // Potential buffer overflow vulnerability
        }
        
        System.out.println("Buffer content: " + new String(buffer));
    }
}
