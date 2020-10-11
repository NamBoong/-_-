package for¹®;

import java.util.Scanner;

public class Main2438 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count = 1;
		
		while(count<=n) {
			for(int i=1; i<=count; i++) {
				System.out.printf("*");
			}
			System.out.println();
			count++;
		}
		scan.close();
	}

}
