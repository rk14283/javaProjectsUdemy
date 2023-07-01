public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double kilometers = (100* 1.609344);
        int highScore = 50;
        if (highScore>25){
            highScore = 100 + highScore; //add bonus points
        }
        int health = 100;
        if((health<25) && (highScore>1000)){
            highScore= highScore-1000;
        }
    }


}

//In the next section we will be talking about expressions, statement,  code blocks, and Methods.
//Don't use a reserved keyword
//Don't use True or False either

//Writing code is similar to writing a document. It consists of special heirarchical units, which together
// form a whole.

//These are:
//The expression- An expression computes to a single value
//The statement- Statements are stand alone units of work.
//And code Blocks- A code block is a set of zero, one, or more, statements, usually grouped, together
// in some way to achieve a single goal
// double kilometers = (100* 1.609344); // a valid Java statement
// int highScore = 50; (highScore>25);  highScore; 100 + highScor// these are expressions

//The expression challenge
//Looking at the code below, what parts are expressions
/*int health = 100;
        if((health<25) && (highScore>1000)){
        highScore= highScore-1000;
        }
 health=100, health<25 , highScore<1000, (health<25) && (highScore>1000) highScore, highScore-1000

 //calculation and if statement includes expressions
 */

//Remember: expressions and keywords would be used a lot in later videos
