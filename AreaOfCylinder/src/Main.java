public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(6);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        Cylinder cylinder = new Cylinder(circle.getRadius(), 7);
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getVolume());
    }
}