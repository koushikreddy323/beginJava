import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculation {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        double first = 1;
        double second = 1;


        try {
            first = sc.nextDouble();
            second = sc.nextDouble();
            try {
                if ((first > 100000) || (second > 100000)) {                //Creating exception
                    throw new Exception();
                }


                System.out.println("Select the operator: +, -, *, /  ");

                char c = sc.next().charAt(0);
                switch (c) {
                    case '+':
                        System.out.println("The sum is : " + (first + second));
                        break;

                    case '-':
                        System.out.println("The difference is : " + (first - second));
                        break;
                    case '*':
                        System.out.println("The multiplied value is : " + (first * second));
                        break;
                    case '/':
                        try {
                            if (second == 0) {
                                throw new ArithmeticException();
                            } else System.out.println("The divided value is :" + (first / second));
                        } catch (ArithmeticException e) {
                            System.out.println("Can't divide by Zero!");
                        }
                        break;
                    default:
                        System.out.println("invalid operator");
                        return;
                }
            } catch (Exception e) {
                System.out.println("maximum input exceded");
            }
            } catch (InputMismatchException e) {
                System.out.println("Enter only in integers!");
            }

        }
    }