import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b and c");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            System.out.println("Delta is negative");
        }
        else {
            double x1 = ((-b) - Math.sqrt(delta)) / (2 * a);
            double x2 = ((-b) + Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 is "+ x1);
            System.out.println("x2 is "+ x2);
        }
    }
}
