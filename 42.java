import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();

        char[] buffer = new char[10];
        int i = 0;
        for (char c : name.toCharArray()) {
            buffer[i++] = c;
            if (i >= buffer.length) {
                break; // Vulnerability: No check for buffer overflow
            }
        }

        System.out.println("Your name is: " + new String(buffer));
    }
}
