import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        float sum = 0.0f;

        for (int i = 1; i <= number; i++) {
            sum += (1.0f / i);

        }
        System.out.println(sum);
    }
}
