package if¹®;

import java.util.Scanner;

public class Main2884 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int min = scan.nextInt();
		
		if(min>=45) {
			System.out.println(hour + " " + (min-45));
		}
		
		if(min<45) {
			if(hour>0) {
				System.out.println((hour-1) + " " + (min+15));
			}
			
			if(hour==0) {
				System.out.println(23 + " " + (min+15));
			}
		}
		
		scan.close();
	}

}
