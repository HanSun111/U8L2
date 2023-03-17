public class Animal {
    private boolean adopted;
    private boolean fed;
    private String name;

    public Animal(boolean adopt, boolean feed, String n){
        adopted = adopt;
        fed = feed;
        name = n;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public boolean isFed() {
        return fed;
    }

    public String getName() {
        return name;
    }

    public void isItAdopted(){
        if(adopted){
            System.out.println("I have been adopted");
        }
        else System.out.println("I am still homeless");
    }
    public void isItFed(){
        if(fed){
            System.out.println("I have been fed");
        }
        else System.out.println("I am hungry");

    }
}
