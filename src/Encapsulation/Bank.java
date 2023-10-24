package Encapsulation;

public class Bank {
    private String accountHolderName;
    private String accountType;
    private long accountNumber;
    double accountBalance;

    public Bank(String accountHolderName, String accountType,long accountNumber,double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void setName(String accountHolderName)
    {
        this.accountHolderName = accountHolderName;
    }
    public String getName(){
        return accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void withdrawBalance(double withdrwaMoney)
    {
        if(withdrwaMoney<accountBalance) {
            accountBalance = accountBalance - withdrwaMoney;
            System.out.println("Withdraw money is " + withdrwaMoney);

        }
        else {
            System.out.println("No sufficient balance to withdraw");
        }

    }
    public void deposit(double depositeMoney)
    {
        if(depositeMoney>0) {
            accountBalance = accountBalance + depositeMoney;
            System.out.println("Deposite money is " +depositeMoney);


        }
        else{
            System.out.println("Enter valid amount for deposit");
        }

    }
    public void checkBalance(){
        System.out.println("Balance is " +accountBalance);

    }

}
