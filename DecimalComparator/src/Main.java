import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        //areEqualByThreeDecimalPlaces(13.55683,13.556895);
        //System.out.println(areEqualByThreeDecimalPlaces(13.55683,13.556895));
       // System.out.println(areEqualByThreeDecimalPlaces(13.55783,13.55689));
        System.out.println(areEqualByThreeDecimalPlaces(3.1756,3.1755 ));}
    public static boolean areEqualByThreeDecimalPlaces(double decimalOne, double decimalTwo){

        boolean checker = false;
        //conversion for decimal one
      String stringValueOne =    Double.toString(decimalOne);
        //System.out.println("value one to string " +stringValueOne);
        String firstDecimalPlaceValueOne = Character.toString(stringValueOne.charAt(2));
        String secondDecimalPlaceValueOne =Character.toString(stringValueOne.charAt(3));
        String thirdDecimalPlaceValueOne = Character.toString(stringValueOne.charAt(4));
        String threeDecimalPlacesValueOne = firstDecimalPlaceValueOne+secondDecimalPlaceValueOne+thirdDecimalPlaceValueOne;
        //System.out.println( "decimal places value one " + threeDecimalPlacesValueOne);

        //Conversion for decimal two
        String stringValueTwo =    Double.toString(decimalTwo);
        //System.out.println("value two to string "+ stringValueTwo);
        String firstDecimalPlaceValueTwo = Character.toString(stringValueTwo.charAt(2));
        String secondDecimalPlaceValueTwo =Character.toString(stringValueTwo.charAt(3));
        String thirdDecimalPlaceValueTwo = Character.toString(stringValueTwo.charAt(4));
        //System.out.println("third decimal place "+ thirdDecimalPlaceValueTwo);
        String threeDecimalPlacesValueTwo = firstDecimalPlaceValueTwo+secondDecimalPlaceValueTwo+thirdDecimalPlaceValueTwo;
       // System.out.println("decimal places value two " + threeDecimalPlacesValueTwo);


        if(Integer.parseInt(threeDecimalPlacesValueOne)==Integer.parseInt(threeDecimalPlacesValueTwo)){
             checker = true;
        }
        else  {
            checker = false;
        }
        return checker;
    }
}