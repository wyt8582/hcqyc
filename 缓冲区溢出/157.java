import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = scanner.nextLine();

        // This code snippet is vulnerable to buffer overflow
        // because it does not perform any input validation or limit the size of the input
        char[] buffer = new char[10];
        for (int i = 0; i < input.length(); i++) {
            buffer[i] = input.charAt(i);
        }

        System.out.println("Hello, " + new String(buffer));
    }
}
