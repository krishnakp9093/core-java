package in.co.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test_formate_date {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat Rohit = new    //click on Simple and import from java
	    SimpleDateFormat ( "dd/MM/yyyy");
	    String str = Rohit.format(d);   //  click and choose
		System.out.println("Date:"+str);
		
		
		
		String str1 = "01/7/2001";
		Date d1 = Rohit.parse(str1);    //click an correct
		System.out.println("D.O.B :"+d1);
		
				
				
	}


	
		
	}


