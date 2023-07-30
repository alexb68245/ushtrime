public class Stutters {
    public static void main(String[] args) {
        String text = "This is a test";

        String[] array = text.split(" ");

        for (int i = 0; i < array.length; i++) {
          System.out.print(" "+array[i] + " " + array[i]);
        }
    }
}
