import java.util.Scanner;

public class BufferOverflowVulnerability {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Assume that the 'name' string is used to create a fixed size byte array
        byte[] buffer = new byte[10];
        
        // Copy the user input 'name' into the buffer without proper length checking
        System.arraycopy(name.getBytes(), 0, buffer, 0, name.length());
        
        System.out.println("Buffer overflow vulnerability example completed.");
    }
}
