import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Creating a fixed-size buffer of 10 characters
        char[] buffer = new char[10];

        // Copying the user input into the fixed-size buffer
        for (int i = 0; i < name.length(); i++) {
            buffer[i] = name.charAt(i);
        }

        System.out.println("Buffer overflow avoided. Your name is: " + new String(buffer));
    }
}
