import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        char[] buffer = new char[10];
        userInput.getChars(0, userInput.length(), buffer, 0);
        
        // This loop does not check the boundary of the buffer array
        for (int i = 0; i <= buffer.length; i++) {
            System.out.print(buffer[i]);
        }
    }
}
