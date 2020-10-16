package 수학2;

import java.util.Scanner;

public class Main1929 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		int check = 0;
		
		for(int i=m; i<=n; i++) {
			if(i==1) {
				check=1;
			}
			
			int eratos = (int)Math.sqrt(i)+1;
			
			for(int l=2; l<eratos; l++) {
				if(i%l==0) {
					check=1;
					break;
				}
			}
		
			if(check==0) {
				System.out.println(i);
			}
			
			check=0;
		}
		scan.close();
	}

}

//https://jul-liet.tistory.com/18 이 사이트를 보고 코딩하였습니다. 참고해주세요~