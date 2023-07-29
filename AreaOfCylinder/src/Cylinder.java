public class Cylinder extends Circle {
    protected double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

        public double getHeight () {
        if(height<0){
            this.height= 0;
        }
        else {
            this.height= height;
        }
        return height;
        }
        public double getVolume () {
            return getArea() * height;
        }

    }


