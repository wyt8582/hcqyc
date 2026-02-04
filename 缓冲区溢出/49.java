import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Vulnerable code - not validating input length
        byte[] buffer = new byte[10];
        System.arraycopy(name.getBytes(), 0, buffer, 0, name.length());

        System.out.println("Welcome, " + new String(buffer));
    }
}
