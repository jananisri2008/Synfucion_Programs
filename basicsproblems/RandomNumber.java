package basicsproblems;
import java.util.*;
public class RandomNumber 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("\t\t\tRandom Numbers");
		System.out.println("\t\t\t***************");
		System.out.println("enter the minimum value");
		int min=sc.nextInt();
		System.out.println("enter the maximum value");
	    int max=sc.nextInt();
	    int res1=(int)(Math.random()*(max-min+1)+min);
	    System.out.println("Integer value between "+min+" and "+max+" is "+res1);
	    double res2=(Math.random()*(max-min+1)+min);	
	    System.out.println("Double value between "+min+" and "+max+" is "+res2);
	}
     
}
