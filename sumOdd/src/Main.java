public class Main {
    public static void main(String[] args) {

        System.out.println("check for even " + isOdd(3));
        System.out.println("check for odd " + isOdd(4));
        System.out.println("checking for negatives " + isOdd(-5));
        System.out.println(sumOdd(5,10));
        System.out.println("Checking for negatives " + sumOdd(-1,-1));
        System.out.println("If start is negative and end is not " + sumOdd(-1,15));
        System.out.println("If end is negative and start is not " + sumOdd(12,-15));
        System.out.println("If end is greater than start " + sumOdd(25,15));
    }
    public static boolean isOdd(int number){
        boolean isOdd = false;
        if (number<0){
         return false;

        }
        if(number%2!=0){
            isOdd = true;
        }


        return isOdd;
    }
   public static int sumOdd(int start, int end){
       int sumOfOdd = 0;
        //this is like the range function in python
       if(end<start || end<0 ||start<0){
           sumOfOdd = -1;
       }
       else {
           for (int i = start; i <= end; i++) {
               //System.out.println(i);
               //System.out.println(" number " + i + isOdd(i));
               if (isOdd(i) == true) {
                   //System.out.println(i);
                   sumOfOdd += i;
               }
           }
       }
       //System.out.println(sumOfOdd);
       return sumOfOdd;
    }


}