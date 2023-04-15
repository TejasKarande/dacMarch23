import java.util.*;
class Ques11{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Input:");
        char i = sc.next().charAt(0);
        char arr[] = {i};

        int codePoint = Character.codePointAt(arr, 0);


        if (Character.isDigit(i)) {
            System.out.println("Value: " + i);
            System.out.println("Code point: " + codePoint);
        } else if (Character.isLowerCase(i)) {
            char upper = Character.toUpperCase(i);
            char arr1[] = {upper};
            int codePoint1 = Character.codePointAt(arr1, 0);
            System.out.println("Upper Case: " + upper);
            System.out.println("Code point: " + codePoint1);
        } else if (Character.isUpperCase(i)) {
            char lower = Character.toLowerCase(i);
            char arr2[] = { lower };
            int codePoint2 = Character.codePointAt(arr2, 0);

            System.out.println("Lower Case: " + lower);
            System.out.println("CodePoint: " + codePoint2);
        } else {
            System.out.println("Invalid input");
        }
    
    }
}