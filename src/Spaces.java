public class Spaces {
    public static void main(String[] args) {
        String text = "Hello my name is Aleksia";
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            char smth = text.charAt(i);
            if (smth == ' '){
                counter++;

            }
        }

        System.out.println("percentage of space is "+ (counter * 100) / text.length() + "%");
    }
}
