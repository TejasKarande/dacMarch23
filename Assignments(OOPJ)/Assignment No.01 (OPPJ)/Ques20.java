class Ques20{
    public static void main(String args[])
    {
        // long value into String
        long L = 256;
        String i = Long.toString(L);
        System.out.println(i);

        // long Value into long instance
        Long S = new Long(L);
        System.out.println(S);

        // String instance into long instance
        String U = "ABC";
        String H = new String();
        Long D = new Long(S);
        System.out.println(D);

        // long value into binary,octal & hexadecimal
        String  E = Long.toBinaryString(L);
        System.out.println(E);
        String F = Long.toHexString(L);
        System.out.println(F);
        String G = Long.toOctalString(L);
        System.out.println(G);

    }
}