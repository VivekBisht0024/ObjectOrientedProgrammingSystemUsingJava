class Shape{

    String color;

}


class Triangle extends Shape{
    public void newShape(){
        System.out.println("Shape is Triangle");
    }
}


public class LearnInheritance {
    public static void main(String[] args) {
        Triangle T1 = new Triangle();
        T1.color="red";
        T1.newShape();

    }
}
