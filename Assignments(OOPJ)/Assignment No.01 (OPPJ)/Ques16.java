class Ques16{
    public static void main(String args[])
    {
        int n = 52;

        //int value to String
        String S = Integer.toString(n); 
        System.out.println(S);

        //int value to Integer instance
        Integer i = Integer.valueOf(n);
        System.out.println(i);

        //String instance to integer instance
        String h = new String("123");
        int k = new Integer(h);
        System.out.println(k);

        //int value to binary , octal and Hexadecimal String
        String B = Integer.toBinaryString(n); 
        System.out.println(B);
        String H = Integer.toHexString(n); 
        System.out.println(H);
        String O = Integer.toOctalString(n); 
        System.out.println(O);
        
        
    }
}