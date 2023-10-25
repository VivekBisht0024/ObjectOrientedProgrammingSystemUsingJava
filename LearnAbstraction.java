// only accessible to the main data using abstract keyword or using interface
// can have abstract methods and non abstract methods.
abstract class Animal{

    abstract void walk();

    public void eat(){
        System.out.println("Animals eats");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class LearnAbstraction {
    public static void main(String[] args) {
    // cannot be created -> Animal a = new Animal();
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
    }
}
