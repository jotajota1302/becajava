package com.es.eoi;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class WrapperTest {

	public static void main(String[] args) throws ParseException, InterruptedException {

		
//		 Calendar cal= Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles"));
//				
//		 String[] zones = TimeZone.getAvailableIDs();
//		
//		 for (String zona : zones) {
//			
//			 cal= Calendar.getInstance(TimeZone.getTimeZone(zona));
//			 System.out.println(zona+": "+ cal.get(Calendar.HOUR_OF_DAY));
//		}
			
		Calendar calOld= new GregorianCalendar(1970,Calendar.MAY,1,0,0,0);
		
		
		
		while (true) {
			
			Calendar calNew= Calendar.getInstance();
			
			Double sec=Double.parseDouble((calNew.getTimeInMillis()-calOld.getTimeInMillis())/1000+"");
			System.out.println("Han pasado " + sec.toString());
			Thread.sleep(1000);
			
		}
		
		
		 
		 
	}

}
