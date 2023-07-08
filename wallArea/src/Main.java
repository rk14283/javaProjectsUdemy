public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(7,7);
        Wall greatWall = new Wall();
        Wall negativeWall = new Wall(-7,7);

        System.out.println(wall.getArea());
        System.out.println(greatWall.getArea());
        System.out.println("negative, wall " + negativeWall.getArea());
        System.out.println("height " + negativeWall.getHeight());
        System.out.println("width " + negativeWall.getWidth());

    }
}