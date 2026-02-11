import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        char[] buffer = new char[10];
        System.arraycopy(name.toCharArray(), 0, buffer, 0, name.length());
        
        System.out.println("Hello, " + new String(buffer));
    }
}
