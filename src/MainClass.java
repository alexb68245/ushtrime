public class MainClass {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setNationality("Albanian");
        author1.setSurname("Fishta");
        Poem poem1 = new Poem(author1, 16);

        Author author2 = new Author();
        author2.setNationality("Albanian");
        author2.setSurname("Frasheri");
        Poem poem2 = new Poem(author2, 19);

        Poem poem3 = new Poem(author1,20);

        Poem[] poems = {poem1, poem2, poem3};

        for (int i = 0; i < poems.length; i++) {
            for (int j = i + 1; j < poems.length -1 ; j++) {
                if (poems[i].getStropheNumber() > poems[j].getStropheNumber()){
                    System.out.println("The author with the longest poem is: " + poems[i].getCreator().getSurname());
                }else {
                    System.out.println("The author with the longest poem is: " + poems[j].getCreator().getSurname());
                }
            }

        }
    }
}
