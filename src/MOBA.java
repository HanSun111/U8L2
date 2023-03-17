public class MOBA extends Game{
    private int Skins;
    public MOBA(String a, String u, int s){
        super(a, u);
        Skins = s;
    }

    public int getSkins() {
        return Skins;
    }
}
