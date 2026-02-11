import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Creating a fixed size buffer with length 10
        char[] buffer = new char[10];
        
        // Copying user input into the buffer without proper length checking
        for (int i = 0; i < name.length(); i++) {
            buffer[i] = name.charAt(i);
        }
        
        // Printing the contents of the buffer
        System.out.println("Buffer content: " + new String(buffer));
    }
}
