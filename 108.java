import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Creating a fixed-size buffer of size 10
        char[] buffer = new char[10];

        // Copying user input into the buffer without checking length
        for (int i = 0; i < input.length(); i++) {
            buffer[i] = input.charAt(i);
        }

        System.out.println("Buffer contents: " + new String(buffer));

        // Other code logic here...
    }
}
