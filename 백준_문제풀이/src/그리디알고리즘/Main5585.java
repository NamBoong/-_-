package 그리디알고리즘;

import java.util.Scanner;

public class Main5585 {

	public static void main(String[] args) {
		
		//기본으로 문제에 주어진 콘인의 종류
		int[] coin = {500, 100, 50, 10, 5, 1};
		
		//scanner에서 받은 값을 1000원에서 빼고 나머지 값을 돌려준다.
		Scanner scan = new Scanner(System.in);
		
		int money = 1000 - scan.nextInt();
		
		// 거스름돈의 갯수
		int count = 0;

		// for문을 통해 500원부터 하나씩 거스름돈을 줄 수 있는지 확인한다. 만약 500원에 나눌 수 없다면 100원으로 for문의 i는 이동하게 된다.
		for(int i=0; i<coin.length; i++) {
			count += money / coin[i];
			money = money % coin[i];
		}
		
		System.out.println(count);
		

	}

}
