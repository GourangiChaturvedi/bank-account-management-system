package bank;
import java.util.*;
public class Account
{
    private String accountNumber;
    private String holderName;
    private double balance;
    private double minimumBalance;
    private ArrayList<String> transactions;

    public Account(String accountNumber,String holderName)
    {
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=0;
        this.minimumBalance=500;
        this.transactions=new ArrayList<>();
        this.transactions.add("Account Created");
    }

    public ArrayList<String> viewTransactionsHistory()
    {
        return transactions;
    } 

    public void deposit(double amount) throws InvalidAmountException
    {
        if(amount<=0)
            throw new InvalidAmountException("Invalid deposit amount");
        else
        {
            balance+=amount;
            transactions.add("Deposited:Rs."+amount);
        }
    }
    
    public void withdraw(double amount) throws InsufficientBalanceException,InvalidAmountException
    {
        if(amount<=0)
            throw new InvalidAmountException("Invalid withdrawal amount");
        if(amount>balance)
            throw new InsufficientBalanceException("Amount to be withdrawn exceeds current balance");
        if(balance-amount<minimumBalance)
            throw new InsufficientBalanceException("Minimum balance must be maintained");
        else
        {
            balance-=amount;
            transactions.add("Withdrawn:Rs."+amount);
        }
    }
    public double getBalance()
    {
         return balance;
    }
}
