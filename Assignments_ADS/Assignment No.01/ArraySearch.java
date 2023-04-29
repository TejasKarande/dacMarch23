class ArraySearch{

private static int[] arr = new int[99];
private static int j = 1;
private static int k = 1;
static void arrayElements(){
    for(int i=0 ; i<arr.length ; i++){
        if(i==45){
            j++;
        continue;
        }
        arr[i] = j;
        j++;
}
    }
static void displayArray(){
    for(int i = 0 ;i<arr.length ;i++)
    System.out.print(arr[i]+" ");
}


static int arrayCheck()
{
   
    for(int i=0 ;i<arr.length ; i++)
    {
        if(arr[i]== k){
        k++;
        continue;
        }
        else
        return k;
    }
    return 0;
}


public static void main(String args[]){
    ArraySearch.arrayElements();
    ArraySearch.displayArray();
    System.out.println();
    int n = ArraySearch.arrayCheck();
    System.out.println("Number not Found = "+n);
}

}