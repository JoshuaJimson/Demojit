package javapgms;
import java.text.SimpleDateFormat;
import java.util.*;
public class Dateclass {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d.toString());
		SimpleDateFormat s= new SimpleDateFormat("D");
		
		Calendar c=Calendar.getInstance();
		System.out.println(s.format(d));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		

	}

}
