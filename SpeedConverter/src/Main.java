public class Main {
    public static void main(String[] args) {
        //These two could be tracked only by BVA
        printConversion(0.0);
        printConversion(95.75);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        double milesPerHour = 0;

      if(kilometersPerHour<0.0){
          milesPerHour = -1;
          return (long)milesPerHour;

      }
      else {
          long newMiles = 0;
          milesPerHour = Math.round((0.62 * Math.round(kilometersPerHour)));
          System.out.println("this value is not rounded" + 0.621*Math.round(kilometersPerHour));
          //System.out.println(milesPerHour);
          return  (long)milesPerHour;

      }

    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour<0.0) {
            System.out.println("invalid value");

        }
        else{
            System.out.println(kilometersPerHour + " km/h" + " = " + toMilesPerHour(kilometersPerHour) + " mi/h");

        }
    }

}