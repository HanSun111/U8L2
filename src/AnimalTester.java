public class AnimalTester {
    public static void main(String[] args) {
        Animal a = new Animal(true, true, "Living thing");
        System.out.println(a.getName());
        System.out.println(a.isAdopted());
        System.out.println(a.isFed());
        a.isItAdopted();
        a.isItFed();

        Cat c = new Cat(true, false, "Shitten", true);
        System.out.println(c.getName());
        System.out.println(c.isAdopted());
        System.out.println(c.isFed());
        c.isItAdopted();
        c.isItFed();
        c.didItSleep();

        Dog d = new Dog(true, true, "HotDawg", false);
        System.out.println(d.getName());
        System.out.println(d.isAdopted());
        System.out.println(d.isFed());
        d.isItAdopted();
        d.isItFed();
        d.Walked();
    }
}
