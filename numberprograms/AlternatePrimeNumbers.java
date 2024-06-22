package numberprograms;

public class AlternatePrimeNumbers 
{
	public static void main(String[] args) 
	{
		int num=1,count=0;
		while(count<num)
		{
			boolean ap=true;
			for(int i=1;i<=num/2;i++)
			{
				if(num%i==0)
					ap=false;
				break;
			}
		}
		/*if(ap)
		{
			if(count%2==0)
				System.out.print(num+" ");
		}*/
	}

}
