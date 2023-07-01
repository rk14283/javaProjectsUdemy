public class Main {
    public static void main(String[] args) {
        System.out.println(area(32));
        System.out.println(area(-45));
        System.out.println(area(25,2));
        System.out.println("negative, length "+ area(-1,23));
        System.out.println("negative breadth "+ area(24,-1));
        System.out.println("both sides negative "+ area(-24,-25));
    }
    public static double area(double radius) {
     if(radius<0){
         return -1.0;
     }
        double  areaCircle = (Math.PI)*(radius*radius);
        return areaCircle;

    }
    public static double area(double length, double breadth){
        if(length<0 || breadth<0){
            return -1.0;
        }
        double areaRectangle = length*breadth;
        return areaRectangle;
    }

}