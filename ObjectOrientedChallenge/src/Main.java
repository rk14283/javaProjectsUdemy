public class Main {
    public static void main(String[] args) {

       // BankAccount bobsAccount = new BankAccount("12345", 5000.00,"Bob Brown", "bob@outlook.com", "(091)1234567");//we are calling constructor here
       //Both constructors are called
        //Default is making a call to the constructor we made
        BankAccount bobsAccount = new BankAccount();
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());
      //  System.out.println(bobsAccount.getCustomerName());
       // System.out.println(bobsAccount.getCustomerEmail());
       // System.out.println(bobsAccount.getCustomerPhone());

//Writing all this data is very tedious and so for that we have constructors
     /*//we replace all this with one statement
        bobsAccount.setAccountNumber("12345");
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmail("obob@gmail.com");
        bobsAccount.setCustomerPhone("09232132");
        bobsAccount.setWithdrawMoney(3000);
        bobsAccount.setDepositMoney(1000);
        bobsAccount.setWithdrawMoney(3000);
        bobsAccount.setDepositMoney(23.5);
        bobsAccount.setWithdrawMoney(23.2);// very long output $0.3000000000000007
        /*
      */
        BankAccount timsAccount = new BankAccount("Tim", "tm@gmail.com", "12345");
        //default number for account number 9999 is printed
        System.out.println("Account Number " + timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());

    }
}


//Object Oriented Challenge
//Create a new class for a bank account
//Create fields for account characteristics like:
    //Account number
    //Account balance
    //Customer name
    //email
    //phone number

//Create getters and setters for each fields.
//Create two additional methods:
    //one for depositing funds into the account
    //One for withdrawing funds from the account

//A customer should not be allowed to withdraw funds, if that withdrawal takes their balance negative
//Create a new project called ClassesChallenge with the usual main method
//You'll create an instance of an Account class, and then test your withdraw and deposit methods.
//You'll print information to the console, that confirms what the balance is after the methods are called.

//You want to make this class encapsulated, so you'll make all your attributes private, and set up getter and setter
//methods for your attributes.
//In addition, you'll have two behavioural methods, for depositing funds, and withdrawing funds
//In addition to this class, you'll set up a Main class, with a main method, that creates at least on instance
//of  the Bank Account class, and simulates depositing and withdrawing money from the account.


