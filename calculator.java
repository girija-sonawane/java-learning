package calculate;
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- SIMPLE CALCULATOR -----");

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nChoose an operation:");
        System.out.println("(+)  for Addition");
        System.out.println("(-)  for Subtraction");
        System.out.println("(*)  for Multiplication");
        System.out.println("(/)  for Division");

        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        double result;

        switch (operator) {

            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator!");
        }

        sc.close();
    }
}
