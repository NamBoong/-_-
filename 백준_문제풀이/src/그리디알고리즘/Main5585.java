package �׸���˰���;

import java.util.Scanner;

public class Main5585 {

	public static void main(String[] args) {
		
		//�⺻���� ������ �־��� ������ ����
		int[] coin = {500, 100, 50, 10, 5, 1};
		
		//scanner���� ���� ���� 1000������ ���� ������ ���� �����ش�.
		Scanner scan = new Scanner(System.in);
		
		int money = 1000 - scan.nextInt();
		
		// �Ž������� ����
		int count = 0;

		// for���� ���� 500������ �ϳ��� �Ž������� �� �� �ִ��� Ȯ���Ѵ�. ���� 500���� ���� �� ���ٸ� 100������ for���� i�� �̵��ϰ� �ȴ�.
		for(int i=0; i<coin.length; i++) {
			count += money / coin[i];
			money = money % coin[i];
		}
		
		System.out.println(count);
		

	}

}
