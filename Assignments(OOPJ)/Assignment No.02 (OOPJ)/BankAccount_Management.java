import java.util.Scanner;
class BankAccount_Data{
   static Scanner sc = new Scanner(System.in);

    private String accHolderName;
    private long accNumber;
    private double accBalance;

    BankAccount_Data()
    {
        
    
    }

    public void createAccount()
    {
        System.out.print("Enter the Name : ");
        this.accHolderName = sc.nextLine();
        System.out.print("Enter the Adhar Number : ");
        this.accNumber = sc.nextLong();
        System.out.println("Account is Suceesfully Created.");
        System.out.println("Account Balance = 0.0");
    }

    public void depositMoney()
    {
        System.out.println("Enter the Account Number :");
        long ACCNumber = sc.nextLong();
        if(this.accNumber == ACCNumber )
        {
            System.out.print("Enter the Amount : ");
            int AddAmount = sc.nextInt();
            this.accBalance = this.accBalance + AddAmount;
            System.out.println("Account Balance = " + this.accBalance);
        }
        else
            System.out.println("Account Number is Invalid");
    }

    public void withdrawMoney()
    {
        System.out.println("Enter the Account Number :");
        long ACCNumber = sc.nextLong();
        if(this.accNumber == ACCNumber )
        {
            System.out.print("Enter the Amount : ");
            int MinusAmount = sc.nextInt();
            if(MinusAmount < this.accBalance)
            {
            this.accBalance = this.accBalance - MinusAmount;
            System.out.println("Account Balance = " + this.accBalance);
            }
            else{
                System.out.println("Not Enough Balance");
            }
        }
        else
            System.out.println("Account Number is Invalid");
    }

    public void getaccBalance()
    {
        System.out.println("Account Balance =  " + this.accBalance );
    }

    public void accHolderInfo()
    {
        System.out.println("Enter the Account Number :");
        long ACCNumber = sc.nextLong();

        if (ACCNumber == this.accNumber)
        {
            System.out.println("Name of Account Holder = "+ this.accHolderName);
            System.out.println("Account Number of Account Holder = "+ this.accNumber);
            System.out.println("Account Number of Account Holder = "+ this.accBalance);
        }
        else
        System.out.println("Invalid Account Number");        
    }


public static int DisplayOption()
{
    Scanner ab = new Scanner(System.in);
    System.out.println("Please Select Any One Below Options :");
    System.out.println("1.Exit");
    System.out.println("2.Create Account");
    System.out.println("3.Deposit Amount");
    System.out.println("4.Withdraw Amount");
    System.out.println("5.Display Account Information");
    System.out.println("Enter the Choice : ");
    int choice = ab.nextInt();
    return choice;
    

}
}


class BankAccount_Management{
    public static void main(String args[])
    {         
       Scanner sc = new Scanner(System.in);          
       BankAccount_Data DT = new BankAccount_Data() ; 
       int choice = BankAccount_Data.DisplayOption();
        while ( choice!=0 )
        {
            switch ( choice )
            {
                case 1 : 
                        System.out.println("Thank You for Using Application"); 
                        choice = 0;
                         break;
                case 2 : 
                        DT = new BankAccount_Data();
                         DT.createAccount();
                         choice = BankAccount_Data.DisplayOption();
                         break;
                case 3 : 
                         DT.depositMoney();
                         choice = BankAccount_Data.DisplayOption();
                         break;
                case 4 : 
                         DT.withdrawMoney();
                         choice = BankAccount_Data.DisplayOption();
                         break;
                case 5 : 
                         DT.accHolderInfo();
                         choice = BankAccount_Data.DisplayOption();
                         break;
                default:
                        System.out.println("Enter valid number");
            }
        }



    }
}