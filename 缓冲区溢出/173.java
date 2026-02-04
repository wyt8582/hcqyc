import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        char[] buffer = new char[10];
        System.arraycopy(name.toCharArray(), 0, buffer, 0, name.length());

        // Simulate a buffer overflow vulnerability by accessing elements beyond the array boundary
        for (int i = 0; i <= buffer.length; i++) {
            System.out.println(buffer[i]);
        }

        scanner.close();
    }
}
