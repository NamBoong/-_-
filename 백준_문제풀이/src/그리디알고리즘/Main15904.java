package �׸���˰���;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main15904 {

	public static void main(String[] args) throws Exception {
		//�־��� ���� �ް� �ٷ� ���� ��¸� �Ѵ�. �������� ucpcfind �޼��尡 ����� ã�� ������ �Ѵ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(ucpcfind(br.readLine()));
	}
		
	static String ucpcfind(String string) {
		char[] UCPC = {'U', 'C', 'P', 'C'};
		//ucpc �迭�� ���ڸ�ŭ ���� string ������ ucpc�� �������ִ��� �Ǻ��ϱ����� ��
		int num = 0;
		
		for(int i=0; i<string.length(); i++) {
			//ucpc�� �� ó�� �迭�� ���� �����Ѵٸ� ���� �ø���. �̴� ucpc�� ������ �߿��ϱ� �����̴�.
			if(string.charAt(i) == UCPC[num]) {
				num++;
			}
			
			//ucpc�� ��� ������� �ִٸ� 4�� �ȴ�. �׷� ���ϰ��� love��.
			if(num == 4) {
				return "I love UCPC";
			}
		}
		
		return "I hate UCPC";
	}
		
}
