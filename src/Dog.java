public class Dog extends Animal{
    public boolean walked;

    public Dog(boolean a, boolean f, String n, boolean s){
        super(a, f, n);
        walked = s;
    }
    public boolean hasWalked() {
        return walked;
    }

    public void Walked(){
        if(hasWalked()){
            System.out.println("I have been walked today");
        }
        else System.out.println("I want to go on a walk :((((");
    }
}
