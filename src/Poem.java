public class Poem {

    private Author creator;

    private int stropheNumber;

    public Poem(Author creator, int stropheNumber){
        this.creator = creator;
        this.stropheNumber = stropheNumber;
    }

    public Author getCreator(){
        return creator;
    }

    public int getStropheNumber(){
        return stropheNumber;
    }
}
