class PatternPP6{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=9;k>=i;k--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}	
}