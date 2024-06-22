package numberprograms;

public class FascinatingNumberRange 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=1000;i++)
		{
			String num=String.valueOf(i);
			String num1=String.valueOf(i*2);
			String num2=String.valueOf(i*3);
			String res=num+""+num1+""+num2;
			boolean isfac=true;				
			for(char ch='1';ch<='9';ch++)
			{
				if(res.indexOf(ch)==-1)
					isfac=false;
			}
			if(isfac)
				System.out.print(i+" ");
		}		
	}
}
