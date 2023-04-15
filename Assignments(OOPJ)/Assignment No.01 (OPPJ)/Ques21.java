class Ques21{
    public static void main(String args[])
    {
        long l = 5;
        Long L = new Long(l);
        System.out.println(L);

        //Long instance into byte
        byte b = L.byteValue();
        System.out.println(b);

        //Long instance into short
        short c = L.shortValue();
        System.out.println(c);

        //Long instance into int
        int i = L.intValue();
        System.out.println(i);

        //Long instance into long
        long k = L.longValue();
        System.out.println(k);

        //Long instance into float
        float f = L.floatValue();
        System.out.println(f);

        //Long instance into double
        double d = L.doubleValue();
        System.out.println(d);


    }
}
