public class Dog extends Animal{

    private String earShape;
    private String tailShape;




    public Dog() {
        super("Mutt", "Big", 50);

    }
    public Dog(String type, double weight){
            this(type, weight, "Perky", "Curled");
        }




    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight <  15 ? "small" : (weight < 35 ? "medium" : "large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

//very important
    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();


          }

   public void makeNoise(){
        if (type == "Wolf"){
            System.out.println("Ow Wooooo!");
        }
        bark();
       System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
       // System.out.println("Dogs run and wag their tail");
        if (speed == "slow"){
            walk();
            wagTail();
        } else{
        run();
        bark();
        }
        System.out.println();
    }

    private void bark(){
        System.out.println("Woof! ");
    }
    private void run(){
        System.out.println("Dog Running!");
    }
    private void walk(){
        System.out.println("Dog Walking!");
    }
    private void wagTail(){
        System.out.println("Tail Wagging");
    }
}

//Code Re-use
//All subclasses can execute methods, even though the code is declared on the parent class.
// The code doesn't have to be duplicated in each subclass.
//We can use code, from the parent.
//Or we can change the code or the subclass

//Overriding
//Overriding a method is when you create a method on a subclass, which has the same signature as a method on a superclass
//You override a parent class method when you want the child class to show different behavior for that method

//Overridden method
//The overridden method can do one of three things:
//It can implement completely different behavior, overriding the behavior of the parent.
//It can simply call the parent class's method, which is somewhat redundant to do.
//Or the method can call the parent class's method, and include other code to run, so it
//can extend the functionality for the Dog, for that behavior.

