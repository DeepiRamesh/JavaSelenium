//74.Print date and time
package com.method;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateAndTime {

	public static void main(String[] args) {
		
		      Date d = new Date(0);
		      SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
		      System.out.println("Date: " +a.format(d));
		   }

	}


