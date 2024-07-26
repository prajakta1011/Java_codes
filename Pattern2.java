class Pattern2{
	public static void main (String[] args)
	{
		int n=10;
		for(int i=n;i>0;i--)
		{
			for(int j=n;j>n-i;j--)
			{
				System.out.print("*"+ " ");
			}
			System.out.print(" "+" ");
		
		System.out.println();
		} 
	}
} 