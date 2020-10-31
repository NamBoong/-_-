package ±¸Çö;

import java.util.Scanner;

public class Main2875 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		
		answer(n, m, k);
		scan.close();
	}
	
	public static void answer(int n, int m, int k) {
		
		int group = 0;
		int intern = n+m;
		
		while(intern>=k) {
			
			if(group*2<=n && group<=m && (n-group*2)+(m-group)>=k) {
				intern = (n-group*2)+(m-group);
			}
			else {
				System.out.println(group-1);
				break;
			}
			group++;
			
		}
	}

}
