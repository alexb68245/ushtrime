import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number");
        float num1 = scanner.nextFloat();
        System.out.println("Enter the operator");
        String operator = scanner.next();
        System.out.println("Enter the second number");
        float num2 = scanner.nextFloat();


        switch (operator){
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "/":
                if (num2 == 0){
                    System.out.println("Cannot calculate");
                }
                System.out.println(num1 / num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
