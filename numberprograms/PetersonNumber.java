package numberprograms;

public class PetersonNumber 
{
	public static void main(String[] args) 
	{
		int n=145,fact=1,temp,sum=0,r;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		temp=fact;
		while(temp>0)
		{
			r=temp%10;
			temp=temp/10;
			sum=sum+fact;
		}
		if(temp==sum)
			System.out.println("peterson");
		else
			System.out.println("not peterson");
	}

}
