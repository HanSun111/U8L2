public class Platformers extends Game{
    private int deaths;
    public Platformers(String a, String u, int d){
        super(a, u);
        deaths = d;
    }

    public int getDeaths() {
        return deaths;
    }
}
