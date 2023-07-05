public class Main {
    public static void main(String[] args) {
        System.out.println("The sum of digits 3213 is " + sumDigits(32123));
        System.out.println("The sum of 4 is " + sumDigits(4));
        System.out.println("Error please enter a positive value "+ sumDigits(-125));
        System.out.println("The sum of two digits 1234 is "+ sumDigits(1234));
    }
    public static int sumDigits(int number){
       int digits = 0;
       int sum=0;
        if(number<0){
            sum =-1;
        }
        else {
            //he uses the expression number>9, instead of number>0
            //If the value is 9 it would not run the last iteration of loop

            while(number>9){
                // digits = number%10;
               sum +=(number%10);
                //sum +=digits;
                number = number/10;
            }
            //this solves it
            sum+=number;

        }
        // using condtion (number>9) then this is required
        return sum;
    }
}


//Digit sum challenge
//In this challenge your task is to write a method, with the name sumDigits, that has a single
//parameter named number, of type int, and it should return an int.
//THe method should only take a number that is a positive number
//If a negative number is passed, it should return -1, meaning an invalid value was passed.
//The method should parse out each digit from the number, and sum the digits up.
//So if 125 is the value passed to the method, the code should sum each digit, in this case,
//1+ 2 + 5, and return 8, as a value
//And another example, if the value is 1000, the code should sum each digit 1 + 0+ 0+ + 0 and return
//1 as a value
//If the number is a single digit number, simply return the number itself as the result.

//n%10 to extract the least significant digit, n= n/10 to drop last digit as you are looping

//How do we solve this
//We take example of 1234
// We use 1234%10 =4, 4 is the most right digit
//sum =4
//next we can drop the most right digit 4, by dividing by 10, 1234/10 = 123
//dividing by 10, cuts the right most digit
//So with each iteration of the loop we are cutting the right most digit
//Now in the second iteration 123%10 = 3 and then we add 3 to sum which already has 4
//No we divide 123 by 10 123/10 = 12
//So in third iteration we have number as 12, sum as 7, if we do modulo we get 2, and if we divide by 10 we get 1
//Now our number is a single digit (number<10), and we break out of the loop
//Now we break out of the loop, number=1 and sum=9, we just add those two and sum 10