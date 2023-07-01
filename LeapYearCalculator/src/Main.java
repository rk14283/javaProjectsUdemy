public class Main {
    public static void main(String[] args) {
      //  System.out.println(isLeapYear(10000));
        System.out.println(isLeapYear(-1));
        //System.out.println(isLeapYear(15));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2600));
        //System.out.println(isLeapYear(2001));
        //isLeapYear(2600);
        //isLeapYear(2000);
    }
    public static boolean isLeapYear(int year){
        boolean response = false;
        if (year >=1 && year<=9999){
            response = true;
            if (response){
                if (year%4 ==0){
                    //response = true;
                    //System.out.println("divisible by 4");
                    if(year%100==0){
                        //System.out.println("divisible by 100");
                        if(year%400==0){
                            //System.out.println("divisible by 400");
                            response = true;
                        }
                        else {
                            response = false;
                        }
                    }
                }
                else {
                    response = false;
                   // System.out.println("not divisible by 4");
                }

            }
            if (!response){
                response = false;
            }
        }
        else {
            response = false;
        }
        return response;
    }

}