import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight(in kg) and height(in cm)");
        float weight = scanner.nextFloat();
        int height = scanner.nextInt();
        double heightInMeters = ((double) height /100 );


        double bmi = weight / (heightInMeters * heightInMeters);

        if (bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Your BMI is " + bmi +" and it is optimal");
        }
        else {
            System.out.println("Your BMI is " + bmi +" and it is not optimal");
        }
    }
}
