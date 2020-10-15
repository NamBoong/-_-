package 함수;

public class Main4673 {

	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
				
		for (int i =1; i <=10000; i++) {
			int n = answer(i);
			
			if(n<10001) {
				check[n] = true;
			}
		}
		
		for(int i=1; i<10001; i++) {
			if(check[i]==false) {
				System.out.println(i);
			}
		}
			
	}
			

	public static int answer(int number) {
		
		int sum = number;
		
		while(number!=0) {
			sum = sum + (number%10);
			number = number/10;
		}
		
		return sum;

	}

}

//https://st-lab.tistory.com/53 이분의 코드를 보고 따라하여 재코딩해봤습니다!