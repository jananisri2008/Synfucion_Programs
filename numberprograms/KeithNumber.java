package numberprograms;

public class KeithNumber
{
	public static void main(String[] args)
	{
		int num=2,temp,r,sum=0,count=0;
		temp=num;
		while(num>0)
		{
			count++;
			r=num%10;
			num=num/10;
			sum=r+num;
		}
		if(sum%temp!=0)
			System.out.print("keith number");
		else
			System.out.print("not keith number");
	}

}
