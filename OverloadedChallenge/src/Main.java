public class Main {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = "+ convertToCentimeters(5,8) + "cm");
        System.out.println("68in = "+ convertToCentimeters(10) + "cm" );
        //System.out.println(convertToCentimeters(10));
       // System.out.println(convertToCentimeters(6,2));

    }
    public static double convertToCentimeters(int heightIninches){

        return heightIninches*2.54;
    }
    public static  double convertToCentimeters(int heightInFeet, int heightInInches){

     //   return  convertToCentimeters((heightInFeet*12)+ heightInInches);
        int feetToInches = heightInFeet*12;
        int totalInches = feetToInches+heightInInches;
        //when you overload methods you will be calling one overloaded method from another as we did here
        double result = convertToCentimeters(totalInches);
        return result;
    }
}

//1 inch = 2.54 cm
// 1 foot = 12 inches

//Overload Method challenge instructions

//Create two methods with the same name: convertToCentimeters
//The first method has one parameter of type int, which represents the entire height
//in inches. You'll convert inches to centimeters, in this method, and pass back the number of
//cms as a double.

//The second method has two parameters of type int, one to represent height in feet and
//one to represent the remaining height in inches. So if a person is 5 foot, 8 inhches,
//the value 5 for feet and 8 for inches would be passed to this method. This method will
//convert feet and inches to just inches, then call the first method, to get the number of centimeters
//also returning the value as a double.


//Both methods should return a real number or decimal value for total height in centimeters
//Call both methods and print out the results.

//The conversion formula from inches to centimeters is 1 inch = 2.54cm.
//Also remember 1 foot = 12 inches