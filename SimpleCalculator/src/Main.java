public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        //you need to use this to set first and second number
      calculator.setFirstNumber(15.0);
        calculator.setSecondNumber(10.0);
        System.out.println("This is addition, " + calculator.getAdditionResult());
        System.out.println("This is subtraction " + calculator.getSubtractionResult());;
        System.out.println("This is multiplication " + calculator.getMultiplicationResult());
        System.out.println("This is multiplication " + calculator.getDivisionResult());;
    }

}