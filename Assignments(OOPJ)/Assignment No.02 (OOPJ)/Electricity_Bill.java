class Electric_Parameter{
    private String Name;
    private int unitConsumed;
    private double billAmount;

    public Electric_Parameter()
    {
        this.Name = null;
        this.unitConsumed = 0;
        this.billAmount = 0.0;
    }
    public Electric_Parameter(String Name , int unitConsumed)
    {
        this.Name = Name;
        this.unitConsumed = unitConsumed;
    }

    public String getName()
    {
        return this.Name;
    }
      public int getunitConsumed()
    {
        return this.unitConsumed;
    }

    public double Calculate_billAmount(int unitConsumed)
    {
        double Amount = 0;
        if (unitConsumed<=100 && unitConsumed>0)
        Amount = unitConsumed*5;
        else if (unitConsumed>100 && unitConsumed<=300)
        Amount = unitConsumed*7;
        else 
        Amount = unitConsumed*10;
        return Amount;
    }

}

class Electricity_Bill{
    public static void main(String args[])
    {
        Electric_Parameter U = new Electric_Parameter("Raju Kadam" , 105);
        double finalAmount = U.Calculate_billAmount(175);
        System.out.println("Name = " + U.getName()+"\n"+"Unit Consumed = "+U.getunitConsumed());
        System.out.println("Bill Amount = "+finalAmount);

    }
}
