//his solution is quite similar to mine
public class hisSolution {
    public static void main(String[] args) {
        int count =0;
        for(int i = 10; count<3 &&i<=50; i++){
            if(isPrime(i)){
                System.out.println("number " + i + " is a prime number");
                count ++;


            }
        }
       // System.out.println("Total number of prime between 1 and 50 is " + count);
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



