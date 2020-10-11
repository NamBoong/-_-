package if¹®;

import java.util.Scanner;

public class Main9498 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		if(a>=90 && a<=100) {
			System.out.println("A");
		}
		
		if(a>=80 && a<90) {
			System.out.println("B");
		}
		
		if(a>=70 && a<80) {
			System.out.println("C");
		}
		
		if(a>=60 && a<70) {
			System.out.println("D");
		}
		
		if(a<60) {
			System.out.println("F");
		}
		
		scan.close();
	}

}
