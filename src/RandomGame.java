import java.util.*;


public class RandomGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(0,100);

        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        do {
            if (randomNumber > userNumber){
                System.out.println("Too little!");
            }else if (randomNumber < userNumber){
                System.out.println("Too much!");
            }

            userNumber = scanner.nextInt();

        }while (randomNumber != userNumber);

        System.out.println("Congratulations!");
    }
}
