
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🔢 Welcome To The Simple Calculator!");
        System.out.println("Type 'exit' anytime to close the calculator.\n");

        while (true) {
            System.out.print("Enter your first number (or type 'exit'): ");
            String input = sc.next();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the calculator! Have a great day 😊.");
                break;
            }
            double num1 = Double.parseDouble(input);

            System.out.print("Choose an operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            System.out.print("Enter your second number: ");
            double num2 = sc.nextDouble();

            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("❌ Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please choose +, -, *, /");
            }
            System.out.println();
        }
        sc.close();
    }
}
