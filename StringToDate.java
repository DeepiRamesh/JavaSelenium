//75. String to Date
package com.method;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
	
String string = "2020-01-01";
		
		System.out.println("Original string (that holds date value) : "+string);
		
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		
		Date dateObject = (Date) dateFormatter.parse(string);
		
		System.out.println("Converted Date value : "+dateObject);

	}

	}


