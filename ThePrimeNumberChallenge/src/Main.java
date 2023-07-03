public class Main {
    public static void main(String[] args) {
        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ")+ "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");
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

//wholeNUmber/2 is halfway mark is efficient


