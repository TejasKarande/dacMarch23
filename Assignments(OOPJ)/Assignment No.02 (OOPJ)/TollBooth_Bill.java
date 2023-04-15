import java.util.Scanner;
class TollBooth_Data{
    private String Vehicle_Type;
    private int NumberofAxles;
    private double Distance;
    private double Distance_Travelled;
    private double Toll_Fee;


    public void setVehicle_Type(String Vehicle_Type)
    {
        this.Vehicle_Type = Vehicle_Type;
    }

    public void setNumberofAxles(int NumberofAxles)
    {
        this.NumberofAxles = NumberofAxles;
    }

     public void setDistance_Travelled(double Distance_Travelled)
    {
        this.Distance_Travelled = Distance_Travelled;
    }


    public void CalculateToll_Fee(String Vehicle_Type , double Distance_Travelled , int NumberofAxles)
    {
        this.Vehicle_Type = Vehicle_Type;
        this.Distance_Travelled = Distance_Travelled;
        this.NumberofAxles = NumberofAxles;
        if(Vehicle_Type == "Truck" || Vehicle_Type == "truck"  )
        {
           this.Toll_Fee =  0.5 * Distance_Travelled * NumberofAxles;
           System.out.println("Toll Fee = "+Toll_Fee);
        }
        else
        {
           this.Toll_Fee =  0.25 * Distance_Travelled * NumberofAxles;
           System.out.println("Toll Fee = "+Toll_Fee);
        }
    
    }

     public String getVehicle_Type()
     {
         return this.Vehicle_Type;
     }

      public int getNumberofAxles()
     {
         return this.NumberofAxles;
     }

     public double getDistance_Travelled()
     {
         return this.Distance_Travelled;
     }

      public double getToll_Fee()
     {
         return this.Toll_Fee;
     }

    public void Generate_Bill(String Vehicle_Type, int NumberofAxles , double Distance_Travelled)
     {
         this.Vehicle_Type = Vehicle_Type;
        this.Distance_Travelled = Distance_Travelled;
        this.NumberofAxles = NumberofAxles;
        if(Vehicle_Type == "Truck" || Vehicle_Type == "truck"  )
        {
           this.Toll_Fee =  0.5 * Distance_Travelled * NumberofAxles;
           System.out.println("Toll Fee = "+Toll_Fee);
        }
        else
        {
           this.Toll_Fee =  0.25 * Distance_Travelled * NumberofAxles;
           System.out.println("Toll Fee = "+Toll_Fee);
        }

        double Bill_Amount = this.Toll_Fee + 2.00 ;
        System.out.println("Due Bill_Amount = "+Bill_Amount);
     }


    public static void DisplayMenuList()
    {
        System.out.println("4.Calculate Toll Fee : ");
        System.out.println("5.Generate Bill : ");
        System.out.println("0.Exit");
        System.out.println("Enter the Choice = ");
    }
        

    
}


class TollBooth_Bill{
    public static void main(String args[])
    {
        Scanner ab = new Scanner(System.in);
        TollBooth_Data DT = new TollBooth_Data();
        System.out.println("1.Enter Vehicle Type");
        String Str = ab.nextLine();
        System.out.println("2.Enter Number of Axle");
        int i = ab.nextInt();
        System.out.println("3.Enter Distance Travelled");
        double d = ab.nextDouble();

        TollBooth_Data.DisplayMenuList();
        int choice = ab.nextInt();

        switch(choice)
        {
            case 4 : DT.CalculateToll_Fee(Str , d , i);
                    break;
                    
            case 5 : DT.Generate_Bill(Str , i , d);
                    break;
        
        }
        
    }

}