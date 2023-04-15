class Ques14{
    public static void main(String args[])
    {
        short a = 2;
        Short s = new Short(a);
        // Short instance to Byte
        byte b = s.byteValue();
        System.out.println("bye ="+b);
    
        // Short instance to short
        short r = s.shortValue();
        System.out.println("short ="+r);

        // Short instance to int
        int t = s.intValue();
        System.out.println("int ="+t);

        // Short instance to long
        long u = s.longValue();
        System.out.println("long ="+u);

        // Short instance to float
        float e = s.floatValue();
        System.out.println("float ="+e);
    
        // Short instance to double
        double k = s.doubleValue();
        System.out.println("double ="+k);

    }
}