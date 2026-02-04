import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        // This code snippet does not perform proper input validation and can lead to buffer overflow vulnerability
        char[] buffer = new char[10];
        userInput.getChars(0, userInput.length(), buffer, 0);
        
        System.out.println("Buffer contents: " + new String(buffer));
    }
}
