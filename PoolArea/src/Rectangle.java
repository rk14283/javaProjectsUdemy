public class Rectangle {
    private double width;
    private double length;


    public Rectangle(double width, double length) {
        if (width<0) {
            this.width = 0;
        }
        else {
            this.width = width;
        }
        if (length<0){
            this.length = 0;
        }
        else {
            this.length = length;
        }



    }
    public double getWidth(){
        if (width<0){
            return 0;
        }
        else {
            return width;
        }
    }
    public double getLength(){
        if (length<0){
            return 0;
        }
        else {
            return length;
        }
    }
    public double getArea(){
        return width*length;
    }
}
