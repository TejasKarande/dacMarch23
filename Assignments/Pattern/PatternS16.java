class PatternS16{
	public static void main(String args[])
	{
	for(int i=5;i>=1;i--)
	{
	for(int j=1;j<i;j++)
	{
	System.out.print(" ");
	}
	for(int k=5;k>=i;k--)
	{
		if ((i==3&&k==4)|| (i==2&&k==4)|| (i==2&&k==3))
		{
			System.out.print(" ");
			continue;
		}
		else
		{
		System.out.print("*");
		}
	}
	System.out.println();
	}
	}
}