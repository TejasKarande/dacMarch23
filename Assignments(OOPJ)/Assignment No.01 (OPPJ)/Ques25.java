class Ques25{
    public static void main(String args[])
    {
        float f = 25.45f;
        Float F = new Float(f);
        System.out.println(F);

        //Float instance to byte
        byte b = F.byteValue();
        System.out.println(b);

        //Float instance to short
        short s = F.shortValue();
        System.out.println(s);

        //Float instance to int
        int i = F.intValue();
        System.out.println(i);

        //Float instance to long
        long l = F.longValue();
        System.out.println(l);

        //Float instance to float
        float k = F.floatValue();
        System.out.println(k);


        //Float instance to double
        double d = F.doubleValue();
        System.out.println(d);


    }
}