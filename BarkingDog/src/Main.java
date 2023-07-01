public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 40));

        System.out.println(shouldWakeUp(true, -1));
        System.out.println(shouldWakeUp(true, 24));
        System.out.println(shouldWakeUp(false, 7));
        //these should be true
        System.out.println(shouldWakeUp(true, 23));

        System.out.println(shouldWakeUp(true, 7));
        System.out.println(shouldWakeUp(true, 6));

    }
    //problematic case: after 22, so 22 and 23 are truebut 24 is false

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeUp = false;
        if (barking && hourOfDay<0 || hourOfDay>23){
            wakeUp = false;
        }
       else if (barking && hourOfDay>8 && hourOfDay<22) {
            wakeUp = false;
        }
        else if (barking && hourOfDay<8 ||hourOfDay>22){
            wakeUp = true;
        }
        else {
            wakeUp = false;
        }
        return wakeUp;
    }
}