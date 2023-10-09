import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        
        if (x <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            System.out.print("Output: ");
            for (int i = 1; i <= x; i++) {
                int oddNumber = 2 * i - 1;
                System.out.print(oddNumber);
                if (i < x) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
