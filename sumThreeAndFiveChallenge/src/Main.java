public class Main {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        for(int i =1; i<=1000; i++){
            //i is displaying the actual numbers that are divisible by 3 and 5
            if(i%3==0 && i%5==0){
                counter++;

                System.out.println(i + " is "+ " number " + counter);

                    sum +=i;



                if(counter==5){
                    break;

                }

            }


        }
        System.out.println("The sum of those numbers is "+ sum);

    }


}



//The sum 3 and 5 challenge
//Create a for loop using a range of numbers from 1 to 1000 inclusive.
//Sum all the numbers that can be divided by both 3 and 5
//print out the numbers that have met the above conditions.
//Break out of the loop once you have found 5 numbers that met the conditionS above.
//After breaking out of the loop, print the sum of the numbers that met the conditions above.
//Note: Type all the code in main method.

