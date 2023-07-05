public class Main {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber =20;
        while(number<=finishNumber){
            number++;
            //he uses continue, but output is the same

/*            if (isEven(number)==true){
                System.out.println("Even number " + number);
            }
            */
            if (!isEven(number)){
                continue;
            }
            System.out.println("Even number " + number);
        }
    }
    public static boolean isEven(int number){
        boolean isEven = false;

        if(number%2==0){
            isEven = true;
        }
        return isEven;
    }
}



//The while loop challenge- Step 1
//So Step 1 is to create a method called isEvenNumber, that takes a parameter of type int
//It's purpose is to determine if the argument passed to the method is an even number or not.
// Return true from the method, if it's an even number, otherwise return false

//Next, use a while loop to test a range of numbers from 5, up to and including 20, but printing
//out only the even numbers, determined by the call to the isEvenNumber method.

//Hint: remainder operator.

//The while loop challenge- step-2
//So, Step 2 is to modify the while code.
// Make it also record the total number of even numbers it has found
//Break out of the loop once 5 even numbers are found
//Finally, display the total number of odd and even numbers found.
