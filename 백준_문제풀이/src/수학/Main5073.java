package ¼öÇÐ;

import java.util.Scanner;

public class Main5073 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int[] arr = new int[3];
			
			for(int i=0; i<3; i++) {
				arr[i] = scan.nextInt();
			}
			
			if(arr[0]==0 && arr[1]==0 && arr[2]==0) {
				break;
			}
			

			if(Math.max(arr[2], Math.max(arr[0], arr[1]))>=(arr[0]+arr[1]+arr[2]-Math.max(arr[2], Math.max(arr[0], arr[1])))) {
				System.out.print("Invalid\n");
				continue;
			}
			
			if(arr[0]==arr[1] && arr[1]==arr[2]) {
				System.out.print("Equilateral\n");
			}
			else if(arr[0]!=arr[1] && arr[1]!=arr[2] && arr[0]!=arr[2] &&
					Math.max(arr[2], Math.max(arr[0], arr[1]))<(arr[0]+arr[1]+arr[2]-Math.max(arr[2], Math.max(arr[0], arr[1])))) {
				System.out.print("Scalene\n");
			}
			else {
				System.out.print("Isosceles\n");
			}
			
		}
		
		scan.close();
	}

}
