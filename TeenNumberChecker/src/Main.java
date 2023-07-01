public class Main {
    public static void main(String[] args) {
        System.out.println( hasTeen(13,25,28));
        System.out.println(hasTeen(25,13,28));
        System.out.println(hasTeen(28,25,13));
        System.out.println(hasTeen(28,28,28));
        System.out.println("second method " + isTeen(10));
    }
    public static boolean isTeen(int age){
        boolean isTeen = false;
        if(age>=13&&age<=19){
            //System.out.println("true");
            isTeen= true;
        }
        else{
            isTeen = false;
        }
        return isTeen;
    }
    public static boolean hasTeen(int ageOne,int ageTwo, int ageThree){
        boolean hasTeen = false;
        if(ageOne>=13&&ageOne<=19){
            //System.out.println("true");
            hasTeen= true;
        } else if (ageTwo>=13 && ageTwo<=19) {
        hasTeen= true;
            //    System.out.println("true");
        }
        else if (ageThree>=13&&ageThree<=19){
            hasTeen= true;
            //System.out.println("true");
        }
        else {
            //System.out.println("false");
            hasTeen= false;
        }
        return hasTeen;
    }
}