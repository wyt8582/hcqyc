import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.next();
        
        char[] buffer = new char[10];
        int length = Math.min(name.length(), buffer.length);
        
        name.getChars(0, length, buffer, 0);
        
        System.out.println("Hello, " + new String(buffer));
    }
}
