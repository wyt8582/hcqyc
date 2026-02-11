import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        char[] buffer = new char[10];
        int i;
        
        for (i = 0; i < name.length(); i++) {
            buffer[i] = name.charAt(i);
        }
        
        System.out.println("Hello, " + new String(buffer));
    }
}
