import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Creating a fixed-size array with length 10
        char[] buffer = new char[10];
        
        // Copying the user input into the fixed-size buffer
        name.getChars(0, name.length(), buffer, 0);
        
        // Printing out the contents of the buffer
        System.out.println("Hello, " + new String(buffer));
    }
}
