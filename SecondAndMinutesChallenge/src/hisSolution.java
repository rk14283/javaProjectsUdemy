public class hisSolution {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int seconds){
        //in my solution I added seconds>0 and execute code then, he did not add an else
        if (seconds<0) {
            return "invalid data for seconds( " + seconds + "), must be a positive integer value";
        }
            int minutes = seconds / 60;
            return getDurationString(seconds/60, seconds%60);
        }

    public static String getDurationString(int minutes, int seconds){

        if (minutes<0) {
            return "invalid data for seconds( " + minutes + "), must be a positive integer value";
        }
        if (seconds<=0 || seconds>59){
            return "Invalid data for seconds " + seconds + "), must be between 0 and 59";
         }
        int hours = minutes/60;
        int remainingMinutes = minutes%60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}

//Second and Minutes challenge Bonus:
//In this part of the challenge, we'll add validation to the methods as a bonus:
    //For the first method,
        //the seconds parameter should be>=0
    //For the second method
      //the minutes parameter should be>=0
        //and the seconds parameter should be >=0 and <=59

//If either method is passed an invalid value, print out some type of meaningful message to user.



