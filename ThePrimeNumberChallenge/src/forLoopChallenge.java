public class forLoopChallenge {
    public static void main(String[] args) {
        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");
        int primeNumberCounter = 0;
        for (int counter=10; counter<=50; counter++){

            if(isPrime(counter)) {
                primeNumberCounter++;
                    //System.out.println(primeNumberCounter);
                if(primeNumberCounter<=3){
                System.out.println(counter + " is " + " number "+ primeNumberCounter );}
                else {break;}
            }

        }


    }
    public static boolean isPrime(int wholeNUmber){
        //This statement eliminates 0,1, 2
        if (wholeNUmber<=2){
            return (wholeNUmber ==2);
        }
        //we will loop from 2 to 7 and see if the number is divisible by 2
        //every even number would return false on first iteration of the loop
        for(int divisor =2; divisor<=wholeNUmber/2; divisor++){
            if(wholeNUmber%divisor==0){
                return false;
            }
        }
        return true;
    }
}

//The For Loop challenge
//Create a prime number counter variable, that will keep count of how many prime numbers were found
//Create a for statement, using any range of numbers, where the maximum number<=1000.
// For each number in the range:
//Check to see if it is a prime number using the isPrime method
//If the number is prime, print it out and increment the prime number counter variable
//Once the prime number counter equals three, exit the loop (Hint, use the break statement to exit)