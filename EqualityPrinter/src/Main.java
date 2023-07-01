public class Main {
    public static void main(String[] args) {
    printEqual(1,1,1);
        printEqual(5,2,5);
        printEqual(2,1,5);
        printEqual(-1,1,1);
        printEqual(0,1,1);
    }
    public static void printEqual(int numberOne, int numberTwo, int numberThree){
        if (numberOne<0||numberTwo<0||numberThree<0){
            System.out.println("Invalid Value");
        }
else {
            if (numberOne == numberTwo && numberOne == numberThree) {
                System.out.println("All numbers are equal");
            } else if (numberOne == numberTwo || numberOne == numberThree || numberTwo == numberThree) {
                System.out.println("Neither all are equal or different");
            } else if (numberOne != numberTwo && numberTwo != numberThree) {
                System.out.println("All numbers are different");
            }
        }
    }


}