import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        char character1 = a.charAt(0);
        char character2 = b.charAt(0);

        System.out.println(character2 - character1);


    }
}
