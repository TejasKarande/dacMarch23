import java.util.Scanner;
class Telephone_Parameter{
    private String customerName;
    private int phoneNumber;
    private int noOfCalls;
    private int durationOfCall;

    public Telephone_Parameter()
    {
        this.customerName = null;
        this.phoneNumber = 0;
        this.noOfCalls = 0;
        this.durationOfCall = 0;
    }
    public void setcustomerName(String Name)
    {
        this.customerName = Name;
    }
    public void setphoneNumber(int Num)
    {
        this.phoneNumber = Num;
    }
    public void setnoOfCalls(int No)
    {
        this.noOfCalls = No;
    }
    public void setdurationOfCall(int min)
    {
        this.durationOfCall = min;
    }
    public double Calculate_billAmount(int noOfCalls , int durationOfCall)
    {
        
            double Amount =0.0;
            if(this.noOfCalls<=100 && this.noOfCalls>0 && this.durationOfCall>1)
            {
                Amount = this.noOfCalls*0.50;
                return (Amount+10);
            }
            else
            {
                Amount = this.noOfCalls*0.25;
                return (Amount+10);
            }
    }    
        

}

class Telephone_Bill{
    public static void main(String args[])
    {
        Telephone_Parameter T = new Telephone_Parameter();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name : ");
        String Str = sc.nextLine();
        T.setcustomerName(Str);
        System.out.print("Enter the Phone Number : ");
        int Num = sc.nextInt();
        T.setphoneNumber(Num);
        System.out.print("Enter the Phone No of Calls : ");
        int N =sc.nextInt();
        T.setnoOfCalls(N);
        System.out.print("Enter the Duration of Calls in Minutes : ");
        int D =sc.nextInt();
        T.setdurationOfCall(D);

        double billAmount = T.Calculate_billAmount(Num , D);

        System.out.println("Bill Amount = "+ billAmount);

    }
}
