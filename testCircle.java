package inheritance;

public class testCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(3.3,"blue",true);
        circle.getArea();
        circle.getPerimeter();
        System.out.println(circle.toString());
        circle.setRadius(4.5);
        circle.getPerimeter();
        circle.getArea();
        circle.setColor("yellow");
        System.out.println(circle.toString());
    }
}
