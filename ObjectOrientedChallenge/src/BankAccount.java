public class BankAccount {
    private String accountNumber = "NLABNA12345";

    private double balance = 5000; //int won't support cents
    private String customerName = "Rohan Kale";
    private String customerEmail = "rohankale@outlook.com";
    private String customerPhone = "(091) 554680942";
    public void setDepositMoney(double depositAmount){
        balance = balance+ depositAmount ;

        System.out.println("Deposit of $" +depositAmount + " made. New balance is $" + balance);
    }
    //Constructor name should be same as class
    //It should have no return type
    public BankAccount(){
        //this is the first line to be called
        this("56789", 2.59, "Default name", "Default address", "Defualt phone");
        System.out.println("Empty constructor called");
    }
    public BankAccount(String accountNumber, double balance,
                       String customerName, String customerEmail, String customerPhone){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;  //better to use this, so you know values are initialized
        //setAccountNumber(accountNumber); //we can use set instead of this but there are conflicting opinions
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = customerEmail;
        customerPhone = customerPhone;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this("999999", 100.55, customerName,customerEmail,customerPhone);
      /*
      this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;

       */
    }

    public void setWithdrawMoney(double withdrawalAmount){
        if(balance-withdrawalAmount<0)
        {
            System.out.println("Insufficient fUnds! You only have $ " +  balance + " in your account ");
        }
        else {
            balance -=  withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed Remaining balance = $" + balance);
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    //he used generate

}




