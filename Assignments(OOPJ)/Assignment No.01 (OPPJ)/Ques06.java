class Ques06{
public static void main(String args[])
{
  // boolean to String
  boolean a = false;
  String Str =  Boolean.toString(a);
  System.out.println(Str);

 // boolean to boolean instance 
  boolean A = true;
  Boolean B = Boolean.valueOf(A);
  System.out.println(B);

 // String to boolean 
  String st = "True" ;
  boolean C = Boolean.valueOf(st);
  System.out.println(C);

 // String to boolean instant 
  String D = "Hello";
  Boolean E = Boolean.valueOf(D);
  System.out.println(E);


}

}