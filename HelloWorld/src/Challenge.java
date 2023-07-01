public class Challenge {
    public static void main(String[] args) {
        double FirstDouble = 20.00d;

        double SecondDouble = 80.00d;
        //Here is the error, you need a parantheses
        //when you add the paranthesis error is gone
        double SumOfDoubles = (FirstDouble + SecondDouble) * 100.00d;
        // System.out.println("this is sum and product " + SumOfDoubles); //test sum*1000
        double RemainderOfDoubles = SumOfDoubles % 40.00d;
        System.out.println("The remainder = " + RemainderOfDoubles); //test remainder of doubles

//The output is different because he skipped parantheses above
/*
        boolean isRemainderZero = false;
        if (RemainderOfDoubles== 0.00){
            isRemainderZero = true;
        }
        //System.out.println(isRemainderZero); remainder is not 0.00

        if (!isRemainderZero){
            System.out.println("got some remainder");
        }
*/
        //he used the ternary operator

        boolean isNotRemainder = (RemainderOfDoubles == 0) ? true : false;
        System.out.println("isNotRemainder = " + isNotRemainder);
        if (!isNotRemainder) {
            System.out.println("Got some remainder");
        }
    }
}



