package one차원배열;

import java.util.Scanner;

public class Main2577 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int abc = a*b*c;
		String ab = Integer.toString(abc);
		String[] arr = ab.split("");
		int[] num = new int[10];
		
		for(int i=0; i<Math.log10(abc); i++) {
			if(Integer.valueOf(arr[i])==0) {
				num[0]++;
			}	
			if(Integer.valueOf(arr[i])==1) {
				num[1]++;
			}
			if(Integer.valueOf(arr[i])==2) {
				num[2]++;
			}
			if(Integer.valueOf(arr[i])==3) {
				num[3]++;
			}
			if(Integer.valueOf(arr[i])==4) {
				num[4]++;
			}
			if(Integer.valueOf(arr[i])==5) {
				num[5]++;
			}
			if(Integer.valueOf(arr[i])==6) {
				num[6]++;
			}
			if(Integer.valueOf(arr[i])==7) {
				num[7]++;
			}
			if(Integer.valueOf(arr[i])==8) {
				num[8]++;
			}
			if(Integer.valueOf(arr[i])==9) {
				num[9]++;
			}
		}

		for(int i=0; i<10; i++) {
			System.out.println(num[i]);
		}
		
		scan.close();
	}

}
