import java.util.Scanner;

public class BufferOverflowVulnerability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char[] buffer = new char[10];
        input.getChars(0, input.length(), buffer, 0);
        
        System.out.println("Buffer contents: " + new String(buffer));
    }
}
