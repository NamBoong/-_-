package ±¸Çö;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main10699 {

	public static void main(String[] args) {

		SimpleDateFormat date = new SimpleDateFormat ("YYYY-MM-dd");
		
		Date time = new Date();
		
		String print = date.format(time);
		
		System.out.println(print);
	}

}
