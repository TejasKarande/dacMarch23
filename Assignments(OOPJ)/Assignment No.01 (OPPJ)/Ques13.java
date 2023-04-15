class Ques13{
    public static void main(String args[])
    {
        short i = 25;

        // short value into String
        String Str = Short.toString(i);
        System.out.println(Str);

        // short value into Short instance
        Short s = Short.valueOf(i);
        System.out.println(s);

        // String instance into Short instance
        String r = new String("45");
        Short t = Short.valueOf(r);
        System.out.println(t);
        
    }
}