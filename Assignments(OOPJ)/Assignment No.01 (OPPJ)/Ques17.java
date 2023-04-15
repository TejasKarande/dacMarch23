class Ques17{
    public static void main(String args[])
    {
        int n = 45;
        Integer i = new Integer(n);
        System.out.println(i);
        
        //Integer instance to byte
        byte b = i.byteValue();
        System.out.println(b);

        //Integer instance to short
        short s = i.shortValue();
        System.out.println(s);

        //Integer instance to int
        int z = i.intValue();
        System.out.println(z);

        //Integer instance to long
        long l = i.longValue();
        System.out.println(l);

        //Integer instance to float
        float f = i.floatValue();
        System.out.println(f);

        //Integer instance to double
        double d = i.doubleValue();
        System.out.println(d);



    }
}