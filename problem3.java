import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        
        if (x <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            System.out.print("Output: ");
            for (int i = 1; i <= x; i += 2) {
                System.out.print(i);
                if (i < x - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
