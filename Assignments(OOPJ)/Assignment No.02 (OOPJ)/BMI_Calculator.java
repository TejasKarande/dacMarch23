import java.util.Scanner;
class BMI_Calculator{
    private double Height;
    private double Weight;

    public BMI_Calculator(){
        this.Height = 0.0;
        this.Weight = 0.0;
    }
    
    public void setHeight(double Height)
    {
        this.Height = Height;
    }

    public double getHeight()
    {
        return this.Height;
    }

     public void setWeight(double Weight)
    {
        this.Weight = Weight;
    }

    public double getWeight()
    {
        return this.Weight;
    }

    double Calculate_BMI(double Height ,double Weight)
    {
         double H = ((this.Height)*(this.Height));
         double BMI = (( this.Weight)/(H) );
         return BMI;
    }
    

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        BMI_Calculator BMI = new BMI_Calculator();

        System.out.print("Enter the Height in Meters : ");
        double height = sc.nextDouble();
        BMI.setHeight(height);
        
        System.out.print("Enter the Weight in Kg : ");
        double weight = sc.nextDouble();
        BMI.setWeight(weight);

        double bmi = BMI.Calculate_BMI(height , weight);
        System.out.println("BMI = "+bmi);

        
        
    }

}