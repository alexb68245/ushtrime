import java.util.Scanner;

public class Waves {
    static void pattern(int wave_height, int wave_length) {
        int i, j, k, e, n, count, x;
        e = 2;
        x = 1;
        // for loop for height of wave
        for (i = 0; i < wave_height; i++) {
            for (j = wave_height; j <= wave_height + i; j++)
                System.out.print(" ");
            // for loop for wave length
            for (count = 1; count <= wave_length; count++) {
                // checking for intermediate spaces
                for (n = (wave_height + wave_height - 2); n >= x; n--)
                    System.out.print(" ");
                for (k = 1; k <= e; k++) {
                    if (k == 1)
                        System.out.print("*");
                    else if (k == e)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            // incrementing counters value by two
            x = x + 2;
            e = e + 2;
            System.out.println();
        }
    }

    // Driver code
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height * 2; j++) {
                if (j == 1 || j == height * 2) {
                    System.out.print("*");
                } else if (i > height / 2 && (j == i || j == height * 2 - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

        }
    }
}
