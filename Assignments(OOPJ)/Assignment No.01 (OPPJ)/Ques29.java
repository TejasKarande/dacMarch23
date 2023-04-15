class Ques29{
    public static void main(String args[])
    {
        double d = 45.6856;
        Double D = new Double(d);
        System.out.println(D);

        //Double instance to byte
        byte b = D.byteValue();
        System.out.println(b);

        //Double instance to short
        short s = D.shortValue();
        System.out.println(s);

        //Double instance to int
        int i = D.intValue();
        System.out.println(i);

        //Double instance to long
        long l = D.longValue();
        System.out.println(l);

        //Double instance to float
        float k = D.floatValue();
        System.out.println(k);


        //Double instance to double
        double L = D.doubleValue();
        System.out.println(d);
    }
}