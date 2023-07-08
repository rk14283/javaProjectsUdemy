public class Point {
private int x;
private int y;
//private double another;

    public Point(){
        //System.out.println("Empty constructor called");
        this(0, 0);

    }
    public Point (int x, int y){
    this.x = x;
    this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
       return Math.sqrt(Math.abs(((x) * (-x)) + ((y)* (-y))));
    }
    public double distance (int x, int y){
        //Here I need to use getX to get values from x
     return Math.sqrt((x-getX())*(x-getX()) + (y-getY())*(y-getY()));
    }
    public double distance (Point another){
        return distance(another.x, another.y);
    }
}

/*
To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:

d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)

Where √ represents square root.
 */