package ±¸Çö;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main16170 {

	public static void main(String[] args) {

		SimpleDateFormat format1 = new SimpleDateFormat ("yyyy");
		SimpleDateFormat format2 = new SimpleDateFormat ("MM");
		SimpleDateFormat format3 = new SimpleDateFormat ("dd");

		Date time = new Date();
		
		String year = format1.format(time);
		String month = format2.format(time);
		String date = format3.format(time);

		System.out.println(year);
		System.out.println(month);
		System.out.println(date);

	}

}
