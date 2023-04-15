class Ques33{
    public static void main(String args[])
    {
        //Arithmetic Operations input from command Line 
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double Add = a+b;
        double Sub = a-b;
        double Mul = a*b;
        if(b!=0)
        {
        double Div = a/b;
        System.out.println("Division = "+Div);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    
        System.out.println("Addition = "+Add);
        System.out.println("Substraction ="+Sub);
        System.out.println("Multiplication ="+Mul);
        
    }
}