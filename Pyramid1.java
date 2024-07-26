class Pyramid1{
	public static void main(String[] args)
	{
		int n=5;
		
		for(int i=0;i<n;i++)
		{
			
				for(int space=0;space<n-i;space++)
				{
					System.out.print(" "+" ");
				}
				for(int num=0;num<=i;num++)
				{
					System.out.print(num+1);
					num++;
				}
				System.out.println();
		}
		

	}
}

			
				