public class Main {
    public static void main(String[] args) {

        //getDurationString(137,54);
        //getDurationString(0,120);
       // getDurationString(120,59);
       // getDurationString(120,-1);
        System.out.println(getDurationString(8472));
        System.out.println(getDurationString(-1));
        System.out.println(getDurationString(3600));
        //minutes cannot be greater than 65
        System.out.println("test case " + getDurationString(65,145));
        //My result is correct
        System.out.println("use in tutorial "+ getDurationString(3945));
    }
    public static  String getDurationString(int seconds){
        if(seconds>=0) {
            //if remainder is 0 it will return 0
            int toMinutes = seconds / 60;
            int toSeconds = seconds % 60;
            // System.out.println(toMinutes);
            String newDuration = getDurationString(toMinutes, toSeconds);
            return newDuration;
        }
        else{
            return "wrong value, please enter seconds greater than 0";
        }

    }
    public static String getDurationString(int minutes, int seconds){

        if (minutes>0&& seconds>=0 &&seconds<=59){
            int convertedSeconds = minutes * 60;
            int totalSeconds = convertedSeconds+seconds;
            int hourFormat = totalSeconds/3600;
            int minutesFormat = (totalSeconds%3600)/60;
            int secondFormat = (totalSeconds%3600)%60;

            String duration = Integer.toString(hourFormat)+ " h "+ Integer.toString(minutesFormat)+" m " + Integer.toString(secondFormat) + " s ";

        //System.out.println(duration);
            return duration;
        }
        else {
            //System.out.println("wrong range");

            return  "Error, please enter correct input";
        }
    }
}
//use module 8274 = 02:17:54
// 8274%60 =54,
//from chat-gpt, it will replace jr developers
//hours = seconds / 3600
 //  minutes = (seconds % 3600) / 60
  // seconds = (seconds % 3600) % 60



//Second and Minutes challenge
// In this challenge, we're going to create a method, that takes time, represented in seconds.
//as a parameter
// We'll then want to transform the second into hours.
//Next we'll display the time in hours, with the remaining minutes and seconds, in a String.
//We'll do this transformation in two steps, which allows us to use overloaded methods.

// We want to create two methods with the same name: getDurationString
// The first method has one parameter of type int, named seconds.
// The second method has two parameters, named minutes and seconds, both ints
//Both methods return a String in the format shown:
//'XXh YYm ZZs'
//Where xx represents number of hours, YY number of minutes, and ZZ the number of seconds
//The first method should in turn call the second method to return its results

//Make both methods public and static as we've been doing so far in this course.
// Remember that one minute is 60 seconds, and one hour equals 60 minutes, or 3600 seconds
// Start by creating a new project, and call it SecondsAndMinutesChallenge

//Add validation to the methods as a bonus:
//For the first method, the second parameter should be>=0;
// For the second method, the minutes parameter should be >=0, and the seconds parameter
//should be >=0, and <=59
//If either method is passed an invalid value, print out some type of meaningful message to the user.


// his solution

