public class Main {
    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        if (score < 5000 && score>200) {
            System.out.println("Your score is less than 5000 but greater than 1000");
        } else if (score<1000){
            System.out.println("Your score was less than 1000");
        }
        else
        {
            System.out.println("Got here");
        }

    }
}


/*
* if (condition){
* //code in the block will execute only if
* //condition is true
* //block can contain 1 or many statement
*
* }
*
* if(condition){
* //code in block will execute only if
* //condition is true
* }
* else if (secondCondition){
* //code in block will execute if first Condition is false
* //and secondCondition is true
* }
* else {
* //Code in block will execute only if
* //condition is false
* }
*
*
* */

//if-then else challenge