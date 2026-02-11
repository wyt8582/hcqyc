import java.util.Scanner;

public class BufferOverflowExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] buffer = new char[10];
        
        // Vulnerability: No bounds checking on the length of input
        for (int i = 0; i < input.length(); i++) {
            buffer[i] = input.charAt(i);
        }

        System.out.println("Buffer contents: " + String.valueOf(buffer));
    }
}
