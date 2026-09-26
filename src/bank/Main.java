package bank;
public class Main {
    public static void main(String args[])
    {
    Account a1=new Account("110","Rahul");
    try
    {
        a1.deposit(1500);
        System.out.println(a1.viewTransactionsHistory());
        a1.withdraw(700);
        System.out.println(a1.viewTransactionsHistory());
        a1.withdraw(400);
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    try
    {
         System.out.println(a1.viewTransactionsHistory());
         a1.deposit(0);
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
     try
    {
         System.out.println(a1.viewTransactionsHistory());
         a1.deposit(-50);
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    try
    {
         System.out.println(a1.viewTransactionsHistory());
         a1.withdraw(0);;
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    try
    {
         System.out.println(a1.viewTransactionsHistory());
         a1.withdraw(-10);
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    System.out.println(a1.viewTransactionsHistory());
   }
}
