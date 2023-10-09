import java.util.Scanner;

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
        return a / b;
    }
}

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the type of operation (+, -, *, /): ");
        String operation = scanner.nextLine();

        double result = 0.0;

        switch (operation) {
            case "+":
                result = calculator.add(a, b);
                break;
            case "-":
                result = calculator.subtract(a, b);
                break;
            case "*":
                result = calculator.multiply(a, b);
                break;
            case "/":
                result = calculator.divide(a, b);
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }

        System.out.println("Result: " + result);
    }
}
