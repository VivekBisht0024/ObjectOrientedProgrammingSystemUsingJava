class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
}

public class LearnClasses{
    public static void main(String[] args) {
        // /Pen p1 = new Pen();
        // p1.color = "Black";
        // p1.type = "gel";

        // p1.write();
        // p1.printColor();

        Student s1 = new Student();
        s1.name = "Vivek";
        s1.age = 24;
        s1.printInfo();
    }
}