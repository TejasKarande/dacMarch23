class PatternPP7{
	public static void main(String args[])
	{
		for(int i=9;i>=1;i--)
		{
			for(int j=i;j<9;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}	
	
}