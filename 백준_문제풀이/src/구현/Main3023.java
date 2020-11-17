package 备泅;

import java.util.Scanner;

public class Main3023 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.next();
		}
		
		int error1 = scan.nextInt();
		int error2 = scan.nextInt();
		
		String[][] answer = new String[n*2][m*2];
		
		int y = 0;
		int x = 0;
		
		// 拉何盒
		for(int i=0; i<arr.length; i++) {
			
			String[] newarr = arr[i].split("");
			
				for(int k=0; k<m; k++) {
					answer[y][x] = newarr[k];
					x++;
				}
			
				for(int k=m-1; k>=0; k--) {
					answer[y][x] = newarr[k];
					x++;
				}
				y++;
				x = 0;
		}
		
		y = n;
		x = 0;
		
		//酒阀何盒
		for(int i=arr.length-1; i>=0; i--) {
			
			String[] newarr = arr[i].split("");
			
				for(int k=0; k<m; k++) {
					answer[y][x] = newarr[k];
					x++;
				}
			
				for(int k=m-1; k>=0; k--) {
					answer[y][x] = newarr[k];
					x++;
				}
				y++;
				x = 0;			
		}
		
		for(int i=0; i<n*2; i++) {
			for(int j=0; j<m*2; j++) {
				if(i+1==error1 && j+1==error2) {
					if(answer[i][j].equals("#")) {
						System.out.printf(answer[i][j].replace("#", "."));
					}
					if(answer[i][j].equals(".")) {
						System.out.printf(answer[i][j].replace(".", "#"));
					}
				}
				if(i+1!=error1 || j+1!=error2) {
					System.out.printf(answer[i][j]);
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
