// Conversion of Byte instance to byte,short,int,long,float,double
class Ques09{
    public static void main(String args[])
    {
        byte z =5;
        Byte a = new Byte(z);
        byte b = a.byteValue();
        System.out.println("byte = " + b);
        short c = a.shortValue();
        System.out.println("short = "+c);
        int d = a.intValue();
        System.out.println("int =" + d);
        long e = a.longValue();
        System.out.println("long ="+e);
        float f = a.floatValue();
        System.out.println("float ="+f);
        double k = a.doubleValue();
        System.out.println("double = "+k);
    }
}