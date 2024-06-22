package conversionprogram;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Date_String 
{
	public static void main(String[] args) 
	{
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
		String str=s.format(d);
		System.out.println(str);
	}

}
