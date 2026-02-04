import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();

        // Assume the name can be any length
        byte[] buffer = new byte[10];
        buffer = name.getBytes();

        System.out.println("Hello, " + new String(buffer));
    }
}
