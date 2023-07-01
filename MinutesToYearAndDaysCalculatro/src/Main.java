public class Main {
    public static void main(String[] args) {
    //printYearsAndDays(525600);
        //printYearsAndDays(-1);
        //printYearsAndDays(0);
       // printYearsAndDays(1440);
        //printYearsAndDays(0);
        printYearsAndDays(525600);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }
        else {
            long numberOfYears = minutes / (60 * 24 * 365);

            long remainingMinutes = minutes % 525600;
            long day = remainingMinutes / 1440;
            System.out.println(minutes + " min " + "= " + numberOfYears + " y" + " and " + day + " d ");

        }
    }
}

//0 min = 0 y and 0 d
//This time I had to go to stack overflow, chatGPT did not help


