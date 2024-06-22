package numberprograms;

public class StrontioNumber 
{
	public static void main(String[] args) 
	{
		int num=7587;
		num=(num*2%1000)/10;
		if(num%10==num/10)
			System.out.println("strontio nummber");
		else
			System.out.println("not strontio number");
		
		
	}

}
