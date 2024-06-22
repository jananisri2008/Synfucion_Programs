package numberprograms;

public class FascinatingNumber
{
	public static void main(String[] args) 
	{
		int num=8935,n2,n3;
			n2=num*2;
			n3=num*3;
		String num1=String.valueOf(num);
		String num2=String.valueOf(n2);
		String num3=String.valueOf(n3);
		String res=num+""+n2+""+n3;
		boolean isfac=true;
		for(char ch='1';ch<='9';ch++)
		{
			if(res.indexOf(ch)==-1)
				 isfac=false;
		}
		if(isfac)
			System.out.println("fascinating number");
		else
			System.out.println("not fascinating number");
		}
	}

