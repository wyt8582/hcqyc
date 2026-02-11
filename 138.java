import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Creating a char array with fixed length
        char[] buffer = new char[10];

        // Copying user input into the fixed-size buffer
        name.getChars(0, name.length(), buffer, 0);

        System.out.println("Hello, " + String.valueOf(buffer));
    }
}
