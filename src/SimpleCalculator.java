import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        calculator();// Method is used to perform basic math operations
    }


    static void calculator() {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        char operator;
        do {
            System.out.print("Enter an operator (+, -, *, /,q): ");
            operator = scanner.next().charAt(0);
            if (operator == 'q') {
                System.out.println("Exiting the program....");
                break;
            } else {
                double output = 0;
                System.out.print("Enter first number:");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number:");
                num2 = scanner.nextDouble();
                switch (operator) {
                    case '+':
                        output = num1 + num2;
                        break;

                    case '-':
                        output = num1 - num2;
                        break;

                    case '*':
                        output = num1 * num2;
                        break;

                    case '/':
                        output = num1 / num2;
                        break;
                    default:
                        System.out.println("You have entered the incorrect operator or The operation you have entered is not supported");
                        return;
                }

                System.out.println(num1 + " " + operator + " " + num2 + ": " + output);

            }

        } while (operator != 'q');
    }
}
