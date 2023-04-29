
class SecondLargestElement{

    static void maxElement(int[] arr)
    {
        int max = arr[0];
        int max1 = arr[0];
       
        
        for(int i=0 ;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max1 = max;
                max = arr[i];
            }
        }
        System.out.println();
       System.out.println("Second Largest Element is = "+max1);
    }


    static void display(int[] arr)
    {
        for(int arr1 : arr)
        System.out.print(arr1+" ");
    }

    public static void main(String[] args)
    {
    
        int[] arr = new int[]{10,20,30,40,50};
        SecondLargestElement.display(arr);

        SecondLargestElement.maxElement(arr);


        System.out.println();
        
    }
}