import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Creating a fixed-size buffer of 10 characters
        char[] buffer = new char[10];
        
        // Copying the user input into the buffer
        name.getChars(0, name.length(), buffer, 0);
        
        // Displaying the contents of the buffer
        System.out.println("Buffer contents: " + new String(buffer));
    }
}
