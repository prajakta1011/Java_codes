import java.util.Scanner;
class Coprime{
	public static void main (String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(),n2=sc.nextInt();

		int small=n1<n2?n1:n2;
		while(true)
		{
			if(n1%small==0 && n2%small==0)
			{
				System.out.print("Numbers are not co prime and its hcf is "+small);
				break;
			}
			else{
				System.out.print("numbers are co prime");
				break;
			}
		}
	}
}