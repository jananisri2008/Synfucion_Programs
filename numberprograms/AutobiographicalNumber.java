package numberprograms;

public class AutobiographicalNumber 
{
	public static void main(String[] args) 
	{
		int num=1210 ,r,sum=0,count=0;
		while(num>0)
		{ 
			count++;
			r=num%10;
			num=num/10;
			sum=sum+r;
			
		}
		if(count==sum)
			System.out.println("Autobiography number");
		else
			System.out.println("not autobiography number");
	}

}
