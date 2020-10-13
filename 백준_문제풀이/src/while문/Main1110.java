package while¹®;

import java.util.Scanner;

public class Main1110 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
	
		int count = 1;
		int m = n;
		
		while(true) {
			
			n = ((n%10)*10) + ((n/10)+(n%10))%10;
			
			if(m==n) {
				break;
			}
			
			count++;

		}
		
		System.out.println(count);
		scan.close();
	}

}
