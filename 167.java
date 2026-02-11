import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        // Vulnerable code - Not checking the length of userInput
        byte[] buffer = new byte[10];
        System.arraycopy(userInput.getBytes(), 0, buffer, 0, userInput.length());
        
        System.out.println("Buffer contents: " + new String(buffer));
    }
}
