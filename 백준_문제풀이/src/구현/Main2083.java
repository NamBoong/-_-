package ±¸Çö;

import java.util.Scanner;

public class Main2083 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			
			String name = scan.next();
			int age = scan.nextInt();
			int weight = scan.nextInt();
			
			if(name.equals("#") && age==0 && weight==0) {
				break;
			}
			
			if(age>17 || weight>=80) {
				System.out.println(name + " Senior");
			}
			else {
				System.out.println(name + " Junior");
			}
			
		}
		
		scan.close();
	}

}
