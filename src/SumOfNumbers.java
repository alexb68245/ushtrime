import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int sum = 0;
        int remaining;

        if (number < 0){
            System.out.println("Please enter a positive number");
        }

        String stringNumber = Integer.toString(number);

        for (int i = 0; i <= stringNumber.length(); i++) {
            sum += number % 10;
            remaining = number / 10;
            number = remaining;
        }

        System.out.println(sum);

    }
}
