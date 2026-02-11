import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Simulating a buffer overflow vulnerability by not properly handling the length of user input
        char[] buffer = new char[10];
        
        for (int i = 0; i < name.length(); i++) {
            buffer[i] = name.charAt(i);
        }
        
        System.out.println("Buffer overflow vulnerability exploited successfully!");
    }
}
