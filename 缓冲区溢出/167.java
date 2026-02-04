import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        String userInput = scanner.nextLine();
        char[] buffer = new char[10];
        
        // Simulating buffer overflow vulnerability by copying user input into a fixed size buffer
        userInput.getChars(0, userInput.length(), buffer, 0);
        
        System.out.println("Buffer contents: " + new String(buffer));
    }
}
