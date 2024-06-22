package numberprograms;

public class GCDNumberWhileloop 
{
	public static void main(String[] args)
	{
		int n1=20,n2=40;
		while(n1!=n2)
		{
			if(n1>n2)
				n1=n1-n2;
			else
				n2=n2-n1;
		}
		System.out.println("gcd of 20 and 40 is "+n2);
	}

}
