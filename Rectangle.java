package inheritance;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth(double width) {
        return this.width;
    }

    public double getHeight(double height) {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return this.width * this.height;
    }

    public double perimeter() {
        return (this.width + this.height) * 2;
    }
    @Override
    public String toString(){
        return "area = "+ area() + "\nperimeter = " + perimeter() + super.toString();
    }
}
