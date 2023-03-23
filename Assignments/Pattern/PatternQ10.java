class PatternQ10{
	public static void main(String args[])
	{
		for(int i=69;i>=65;i--)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=69;k++)
			{
				System.out.print((char)k+" ");
			}
			System.out.println();
		}
	}
}