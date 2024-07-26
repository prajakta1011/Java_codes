import java.util.Scanner;
class DuckNumber{
	public static void main (String[] args)
	{	
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		while(num>0)
		{
			int rem=num%10;
			if(rem==0)
			{
				System.out.println("Number is a duck number");
				break;
			}
			else if(rem!=0) {
				System.out.println("Number is not a duck number");
				break;
			}
			num/=10;

		}
		
	}
}
		