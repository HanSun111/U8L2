public class Cat extends Animal{
    private boolean slept;
    public Cat(boolean a, boolean f, String n, boolean s){
        super(a, f, n);
        slept = s;
    }

    public boolean isSlept() {
        return slept;
    }

    public void didItSleep(){
        if(isSlept()){
            System.out.println("I have slept my daily 16 hours");
        }
        else System.out.println("I am tired zzzzZZZZZZZ");
    }
}
