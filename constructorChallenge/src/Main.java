public class Main {
    public static void main(String[] args) {
        //He passed the values here
        Customer Rohan= new Customer("Rohan Kale", 1000, "rohan@outlook.com");
        System.out.println(Rohan.getName());
        System.out.println(Rohan.getCreditLimit());
        System.out.println(Rohan.getEmailAddress());
        //this will not work without no args
        Customer tim = new Customer();
        System.out.println(tim.getName());
        System.out.println(tim.getCreditLimit());
        System.out.println(tim.getEmailAddress());

        //Eventhough we pass 2 arguments, we still get a default
        //and it is cool because if no value is eneterd, instead of an error we can give a default
        Customer thirdCustomer = new Customer("Joe", "joe@gmail.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmailAddress());
    }

}

//Constructor challenge exercise
//So for this challenge you'll want to:
//1. Create a new class, called Customer, with three fields:
    //name, credit limit, email address
//2. Create the getter methods only, for each field. You don't need to create the setters.
//3. Create three constructors for this class:
    //.First create a constructor for all three fields which should assign the arguments directly to the instance fields.
    //.Second, create a no args constructor that calls another constructor, passing some literal values for each argument.
    //.And lastly, create a constructor with just the name and email parameters, which also calls another constructor.

//This whole activity is constructor chaining
//I am getting less things correct here