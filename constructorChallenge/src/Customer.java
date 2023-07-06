public class Customer {
    //values are passed in the constructor
    private String name;
    private double creditLimit;
    private String emailAddress;
//style: constructors organized from least amount of parameters to most
    //noargs with 2 parameters and calling another constructor
    public Customer(){
        this("Default name", "default@gmail.com");
        //System.out.println("Empty constructor called");

    }


    //Second constructor created, and no args would not work without it
    public Customer (String name, String emailAddress){
        this(name, 1000, emailAddress);
      //  System.out.println("Constructor with 2 parameters called");
    }

    //First constructor created
    public Customer(String name, double creditLimit, String emailAddress) {
        //System.out.println("Customer constructor with parameters called");
        this.name = name;
        this.creditLimit= creditLimit;
        this.emailAddress = emailAddress;
    }




    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
