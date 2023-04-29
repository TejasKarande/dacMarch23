 class Array{
	
	private static int size ;
	
	static void search(int[] arr)
	{
        int var = 0 ;
		for(int index = 0; index<arr.length ; index++)
		{   
            for(int j =index+1 ;j<arr.length ; j++)
            {
                if(arr[index] == arr[j])
                {
                var = arr[index];
                System.out.println("Duplicate Elements are = "+var);
                }
            }
		}
      
    
	}
 

	static void display(int[] arr){
		for(int a1 : arr)
			System.out.print(a1 + " ");
	}
				


}

public class DuplicateElement{
	public static void main(String[] args)
	{	
		int[] arr = new int[]{10,20,30,30,50};
		Array.display(arr);
		System.out.println();
		Array.search(arr);
        

		
	}
}
