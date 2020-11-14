package ¹®ÀÚ¿­;

import java.util.Scanner;

public class Main5704 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			String n = scan.nextLine();
			
			if(n.equals("*")) {
				break;
			}
			
			System.out.println(answer(n));
		}
		
		scan.close();
	}
	
	public static String answer(String n) {
		
		int count = 0;
		int num = 97;
		int count2 = 0;
		
		while(count2<n.length()) {
			for(int i=0; i<n.length(); i++) {
				if(n.charAt(i)==num) {
					count++;
					num++;
					
					if(num>=122) {
						num = 122;
					}
					break;
				}
			}
			
			count2++;
		}
		
		if(count>=26) {
			return "Y";
		}
		else {
			return "N";
		}
		
	}

}
