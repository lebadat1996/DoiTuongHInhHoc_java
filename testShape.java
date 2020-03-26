package inheritance;


    public class testShape {
        public static void main(String[] args) {
            Shape shape = new Shape();
            System.out.println(shape);
            Shape shape1 = new Shape("red", false);
            System.out.println(shape1);

            Circle circle=new Circle();
            System.out.println(circle.toString());
        }
    }

