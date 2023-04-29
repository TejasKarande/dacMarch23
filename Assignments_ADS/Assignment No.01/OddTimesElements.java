 class Array{
	
	private static int size ;
	
	static void search(int[] arr)
	{
        int var = 0 ;
        int count = 0;
		for(int index = 0; index<arr.length ; index++)
		{   
            for(int j =index+1 ;j<arr.length ; j++)
            {
                if(arr[index] == arr[j])
                {
                   var = arr[j];
                    count++;
                }
            }
		}
        if(count%2 == 0)
            System.out.println(var  +" Number found at Even Time");
        else
            System.out.println(var +" Number found at odd Time");
      
    
	}
 

	static void display(int[] arr){
		for(int a1 : arr)
			System.out.print(a1 + " ");
	}
				


}

public class OddTimesElements{
	public static void main(String[] args)
	{	
		int[] arr = new int[]{30,20,30,30,50};
		Array.display(arr);
		System.out.println();
		Array.search(arr);
        

		
	}
}
