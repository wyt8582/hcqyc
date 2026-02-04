import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        char[] buffer = new char[10];
        inputString.getChars(0, inputString.length(), buffer, 0);
        
        System.out.println("Buffer content: " + buffer);
    }
}
