import java.util.Scanner;

public class BufferOverflowExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = scanner.next();
        
        char[] buffer = new char[10];
        
        // Simulating buffer overflow vulnerability
        for (int i = 0; i < userInput.length(); i++) {
            buffer[i] = userInput.charAt(i);
        }
        
        System.out.println("Buffer content: " + new String(buffer));
    }
}
