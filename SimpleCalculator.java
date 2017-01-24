import java.util.Scanner;

public class SimpleCalculator {
    
    public static void main(String[] args) {
        double n1, n2;
        String operation;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        n1 = input. nextDouble();

        System.out.println("Enter second number");
        n2 = input. nextDouble();

        Scanner op = new Scanner(System.in);
        System.out.println("Enter your operation");
        operation = op.next();

        switch (operation)  {
        case "+":
            System.out.println("Your answer is " + (n1 + n2));
            break;

        case "-":
            System.out.println("Your answer is " + (n1 - n2));
            break;

        case "/":
          if(n2!=0)
            System.out.println("Your answer is " + (n1 / n2));
          else
            System.out.println(" you can't devide a number by zero");
            break;

        case "*":
            System.out.println("Your asnwer is " + (n1 * n2));
            break;

        default:
            System.out.println("Use a correct operator");

        }
    }
}