import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		/*1~45 사이의 숫자 중에 6개 숫자를 뽑는다
		 * 
		 * 6개씩 다섯줄을 만든다. 30개의 숫자 중에 서로 중복되는 것은 없게 만든다. 
		 /**/
		//1.6개의 랜덤 숫자를 만들어준다
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 세트 뽑아볼까요? ==");
		int set = sc.nextInt();
		int cnt = 1;
		while(set>0) {
		int lotto[] = new int[6];
		for(int i = 0;i<lotto.length;i++) {
			int temp = (int)(Math.random()*45 +1);
			lotto[i] = temp;
		//2. 6개 사이에 중복되는 숫자가 없는지 확인한다.
			for(int j = 0; j<i;j++) {
				if(lotto[j] == temp) {
					i--;
					break;
				}
			}
		}
		for(int i = 0; i<lotto.length;i++) {
			System.out.print(lotto[i] + "  " );
		} 
		set--;
		for(int i = 0; i<lotto.length;i++) {
			System.out.print(lotto[i] + "  " );
		} 
		cnt++;
		continue;
		//3. 6줄 가운데 중복되는 줄이 없는지 확인한다. 
	
		}
	}
}

