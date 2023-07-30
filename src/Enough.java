import java.util.Objects;
import java.util.Scanner;

public class Enough {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text; the program will stop when you write enough");
        String text;
        String longestText = "";

        do {
            text = scanner.nextLine();
            if (text.length() > longestText.length()){
                longestText = text;
            }
        } while (!Objects.equals(text, "Enough"));
        System.out.println(longestText);
    }
}
