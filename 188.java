import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        char[] buffer = new char[10];
        
        // Copy the user input into the buffer without checking its length
        inputString.getChars(0, inputString.length(), buffer, 0);

        System.out.println("Buffer content: " + new String(buffer));
    }
}
