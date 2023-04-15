class Ques24{
    public static void main(String args[])
    {
        float n = 2.4f;
        
        // float value into String
        String S = Float.toString(n);
        System.out.println(S);

        // float value into float instance
        Float F = new Float(n);
        System.out.println(F);

        //String instance into float instance
        String H = new String("12.45");
        Float f = new Float(H);
        System.out.println(f);

        //float value into hexadecimal string
        String O = Float.toHexString(n);
        System.out.println(O);

    }
}