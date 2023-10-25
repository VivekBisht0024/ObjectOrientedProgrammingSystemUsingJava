class Area {
    int length;
    int breadth;

    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    public void getArea() {
        int area = length * breadth;
        System.out.println(area);
    }

}

public class LearnEncapsulation {
    public static void main(String[] args) {
        Area rectangle = new Area(5,7);
        rectangle.getArea();
    }
}