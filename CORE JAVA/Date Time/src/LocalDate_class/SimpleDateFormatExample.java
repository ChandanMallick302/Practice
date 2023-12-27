package LocalDate_class;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
public static void main(String[] args) {
	Date date=new Date();
	SimpleDateFormat formater=new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
	String str=formater.format(date);
	System.out.println(str);
	
	SimpleDateFormat formater1=new SimpleDateFormat("E,dd/MMMM/yyyy hh:mm:ss");
	String str2=formater1.format(date);
	System.out.println(str2);
	
	SimpleDateFormat formater2=new SimpleDateFormat("E,dd/MMMM/yyyy zzzz");
	String str3=formater2.format(date);
	System.out.println(str3);
}
}
