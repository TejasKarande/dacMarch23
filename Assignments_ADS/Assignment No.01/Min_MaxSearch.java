
class Min_MaxSearch{

    static void maxElement(int[] arr)
    {
        int max = arr[0];
        int min = arr[0];
       
        
        for(int i=0 ;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
               max = arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println();
       System.out.println("Max = "+max+ " Min = "+ min);
    }


    static void display(int[] arr)
    {
        for(int arr1 : arr)
        System.out.print(arr1+" ");
    }

    public static void main(String[] args)
    {
    
        int[] arr = new int[]{30,20,120,70,50};
        Min_MaxSearch.display(arr);

        Min_MaxSearch.maxElement(arr);


        System.out.println();
        
    }
}