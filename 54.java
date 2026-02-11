import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        char[] buffer = new char[10];
        userInput.getChars(0, userInput.length(), buffer, 0);
        
        // This code does not check the length of the user input
        // and may lead to buffer overflow if the input is longer than the buffer size
    }
}
