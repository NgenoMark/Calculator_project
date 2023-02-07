    import java.util.Scanner;

    public class calc {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter first number:");
            double firstNumber = input.nextDouble();

            System.out.println("Enter second number:");
            double secondNumber = input.nextDouble();

            System.out.println("Enter an operator (+, -, *, /):");
            char operator = input.next().charAt(0);

            double result;
            switch (operator) {
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    result = firstNumber / secondNumber;
                    break;
                default:
                    System.out.println("Error: Invalid operator");
                    return;
            }

            System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
        }
    }


