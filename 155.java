import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        char[] buffer = new char[10];
        
        // Copy the input name into the buffer
        for (int i = 0; i < name.length(); i++) {
            buffer[i] = name.charAt(i);
        }
        
        // Display the contents of the buffer
        System.out.println("Buffer content: " + new String(buffer));
    }
}
