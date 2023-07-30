import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sneeze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String text = scanner.nextLine();

        if (Pattern.matches("acho*",text)){
            System.out.println("Bless you!");
        }else {
            System.out.println("OK");
        }
    }
}
