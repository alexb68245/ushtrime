import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //2piR
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the diameter of the circle");
        float diam = scanner.nextFloat();

        double parameter = (2 * Math.PI * (diam / 2));

        System.out.println("The parameter is "+ parameter);
    }
}