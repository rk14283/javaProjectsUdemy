public class Main {
    public static void main(String[] args) {
        /*
     for (int counter =1 ; counter <5; counter++){
         System.out.println(counter);
     }
     */

     //to convert it to a for loop, look at the parameter that is changing
/*
        for (double rate= 2.0; rate<=5.0; rate++){
            double interestAmount = calculateInterest(10000.0,rate);
            System.out.println("10000 at " + rate + "% interest = " + interestAmount);
        }
*/
        //He uses i instead of rate
        //i is short for iteration
        for (double i= 7.5; i<=10.0; i+=0.25){
            double interestAmount = calculateInterest(100.0,i);
            if (interestAmount>8.5){
                break;
            }

            System.out.println("$100 at " + i + "% interest = $" + interestAmount);

        }
    }
    public static double calculateInterest(double amount, double interestRate){
      //  return ((amount)* (interestRate/100));
        return ((amount)* (interestRate/100));
    }


}

/*
for (init; expression; increment){
//block of statements
//The initialization declares or sets state, usually declaring and initializig a loop variable,
before the loop begins procesing.
//The expression section, once it becomes false, will end the loop processing
//The increment section is executed after the expression is tested, and is generally, the place wherre
the loop variable is incremented
}
        */

//Mini challenge
//Using a new statement, call the calculateInterest method with the dollar amount of 100
//And this time, use the interest rates between 7.5 and 10, but increment by a quarter of a percent
//each time, meaning 0.25%


//The break statement
//A break statement transfers control of an enclosing statement
//We've seen the break statement in the switch statement, but it can also be used in a loop.

