public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //int is the keyword, myVariable= 50 is the expression, and statement is the entire line
        //Java statements can be assignment expressions
        int myVariable = 50;
        //the semicolon makes each of these a statement without the semicolon, it is an expression
        myVariable++;
        myVariable--;
        System.out.println("This is a test");
        System.out.println("This is " +
                " another " +
                " still more. ");
        //not reccomended
        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable");
        if (myVariable ==0){
            System.out.println("It's now zero");
        }
    }
}


//; (semicolon) is required to make Java statements
//Java statements do not have to be on one line

//break up the parts of statement so it is more readable

//Whitespace
//What is whitespace?
//white space is any extra spacing, horizontally or vertically placed around Java source code
//iT is usually added for human readability purposes
//In Java, all these extra spaces are ignored

//So Java trets code like this
//   int anotherVariable = 50; myVariable--;System.out.println("myVariable");
//The same as code like this:
/*int anotherVariable = 50;
myVariable--;
System.out.println("myVariable");

 */

//shift+ tab removed indentation
//indentation makes it easier to see logicla flow

//The google Java guide, is good to know about whitespace and indentation

