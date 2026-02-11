import java.util.Scanner;

public class BufferOverflowExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        // Vulnerability: Not checking the length of userInput before assigning it to buffer
        byte[] buffer = new byte[10];
        System.arraycopy(userInput.getBytes(), 0, buffer, 0, userInput.length());
        
        System.out.println("Buffer content: " + new String(buffer));
    }
}
