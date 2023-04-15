class Ques08{
    public static void main(String args[])
{
    // byte Value to String
    byte b = 12;
    String K = Byte.toString(b);
    System.out.println(K);

    // byte Value to Byte instance
    byte c = 12;
    Byte L = Byte.valueOf(c);
    System.out.println(L);

    //  String instance into byte instance
    String d = new String("25");
    Byte o = Byte.valueOf(d);
    System.out.println(o);

}
}