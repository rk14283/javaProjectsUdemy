public class Main {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,2,3));
        System.out.println( hasEqualSum(1,2,1));
    }
    public static boolean hasEqualSum(int numberOne, int numberTwo, int numberThree){
        int sumOfFirstTwo = numberOne+numberTwo;
        boolean isEqual = false;
        //System.out.println(sumOfTwo);
        if(sumOfFirstTwo==numberThree){
            isEqual = true;
        }
        else{
            isEqual = false;
        }
        return isEqual;

    }
}