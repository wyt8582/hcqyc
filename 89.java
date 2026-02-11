import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        char[] buffer = new char[10];
        userInput.getChars(0, userInput.length(), buffer, 0);

        System.out.println("Buffer content: " + new String(buffer));
    }
}
