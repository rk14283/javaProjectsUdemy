public class Main {
    public static void main(String[] args) {
        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println("New score is " + calculateScore(10));
    }
//when calling a method we need to create unique method signature

    //to overload we just changed parameter, changing name is not overloading
    public static int calculateScore(String playerName, int score){
        System.out.println("Player" + playerName + " scored " + score + " points " );
        return score * 1000;
    }
    public static int calculateScore(int score){
        return calculateScore("Anonymmus", score);
    }
    public static int calculateScore(){
        System.out.println("No player name, no player score ");
        return 0;
    }
  /* //This will give an error because changing return type does not make a unique method,
   we need to change parameters
  public static void calculateScore(){
        System.out.println("No player name, no player score ");

    */
}


//Method overloading occurs when a class has multiple methods, with the same name,
// but the methods are declared with different parameters

//So you can execute a method with one name, but call it with different arguments

//Java can resolve which method it needs to execute, based on arguments being passed when the
//method is invoked

//More on Method signatures
//A method signature consists of the name of the method, and the uniqueness of the declaration
//of its parameters.

//In other words, a signature is unique, not just by the method name, but in combination
//with the number of parameters, their types, and the order in which they are declared.

//A method's return type is not part of the signature
// A parameter name is also not part of the signature

//valid overloaded Methods
//The type, order, and number of parameters, in conjuction with the name, make a method
//signature unique

//A unique method signature is the key for Java compiler, to determine if a method is overloaded
//correctly

//The name of the parameter is not part of the signature, and therefore it doesn't matter,
//from Java's point of view, what we call our parameters


//Valid overloaded Methods
/*
* public static void doSomething (int parameterA){
* //method body
* }
*
* public static void doSomething (float parameter){
* //method body
* }
*
* public static void doSomething (int parameterA, float parameterB){
* //method body
* }
* public static void doSomething (float parameterA, int parameterB){
* //method body
* }
* public static void doSomething (int parameterA, int parameterB, float parameterC){
* //method body
* }
*
* */
//Invalid overload Methods
//Parameter names are not important when determining if a method is overloaded.
//Nor are return types used when determining if a method is unique

/*
* public static void doSomething(int parameterA){
* //method body
* }
*
* public static void doSomething (int parameterB){
* //method body
* }
* public static int doSomething (int parameterA){
* return 0;
* }
* */