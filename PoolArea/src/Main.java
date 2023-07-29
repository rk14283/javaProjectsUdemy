public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(9,6);
        System.out.println(rectangle.getArea());
        Cuboid cuboid = new Cuboid(rectangle.getLength(), rectangle.getWidth(), 7);
        System.out.println(cuboid.getHeight());
        System.out.println(cuboid.getVolume());
    }
}