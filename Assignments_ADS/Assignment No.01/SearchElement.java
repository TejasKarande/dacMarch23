import java.util.Scanner;
class SearchElement{
    private static int[] arr;
    private static Scanner sc = new Scanner(System.in);


    static void arraySearch(int num)
    {
        int flag = 0;
        for(int i=0 ;i<arr.length;i++)
        {
            if(arr[i] == num)
            {
                System.out.print("Element is Found at Index = "+i);
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("Element is Not Found");
        }
    }


    static void display()
    {
        for(int arr1 : arr)
        System.out.print(arr1+" ");
    }

    public static void main(String[] args)
    {
    
        arr = new int[]{10,20,30,40,50};


        SearchElement.display();

        System.out.println();
        System.out.print("Enter the Number to Be Searched = ");
        SearchElement.arraySearch(sc.nextInt());
    }
}