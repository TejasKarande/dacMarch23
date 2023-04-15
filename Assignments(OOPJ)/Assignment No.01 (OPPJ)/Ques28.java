class Ques28{
    public static void main(String args[])
    {
        double d = 24.24;
         // double value into String
        String S = Double.toString(d);
        System.out.println(S);

        // double value into Double instance
        Double D = new Double(d);
        System.out.println(D);

        //String instance into Double instance
        String H = new String("12.45");
        Double f = new Double(H);
        System.out.println(f);

        //double value into binary,octal,hexadecimal string
        long B = Double.doubleToLongBits(d);
        String Str = Long.toBinaryString(B);
        System.out.println(Str);
        String P = Long.toOctalString(B);
        System.out.println(P);
        String Q = Long.toHexString(B);
        System.out.println(Q);
    }
}