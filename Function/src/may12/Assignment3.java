package may12;

public class Assignment3 {

	public static void main(String[] args) {
		// 큰 금액 동전을 우선적으로 거슬러주기
		int[]coinUnit  = {500,100,50,10};
		int money = 2860;
		int[]change = new int [coinUnit.length];
		
		System.out.println("money : " + money);
		for(int i = 0; i<coinUnit.length;i++) {
			int temp = money/coinUnit[i];
			
			change[i] = temp;
			temp = 0;
			
			money-=(coinUnit[i]*change[i]);
			
			//money = money%coinUnit[i]; 이렇게도 쓸 수 있다. 
			
			//System.out.println("바꿔야하는 잔액 : " + money);
			System.out.println(coinUnit[i] + "원 : " + change[i]);
			}
		}
	}

