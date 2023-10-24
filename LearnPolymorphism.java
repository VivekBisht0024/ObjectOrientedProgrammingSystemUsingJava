class Student{
    String name;
    int age;


    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}


public class LearnPolymorphism {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printInfo("Vivek");
        s1.printInfo(24);
        s1.printInfo("Vivek" , 24);
    }
    
}

// compile Time polymorphism
