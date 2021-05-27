
public class MainClass2 {

	public static void main(String[] args) {
		//선언부
		boolean swit[] = new boolean[45];
		int lotto[] = new int[30];
		//random 할당
		int w, r; 
		w = 0;
		while(w<30) {
		r = (int)(Math.random()*45);
		if(swit[r] == false) {
			swit[r] = true;
			lotto[w] = r+1; //r이 0~9까지만 나오니까
			w++;
			}
		}
		for(int i = 0; i<lotto.length; i++) {
			System.out.print(lotto[i] + "  ");
			if((i+1)%6==0) {
				System.out.println();
			}
		}
	}
}
		/*while(true) {
			r_num[0] = (int)(Math.random()*9) +1;
			r_num[1] = (int)(Math.random()*9) +1;
			r_num[2] = (int)(Math.random()*9) +1;
			
			if(r_num[0]!=r_num[1]&&r_num[0]!=r_num[2]&&r_num[1]!=r_num[2]) {
				break;
			}
		}
		for(int i = 0; i<r_num.length;i++){
			System.out.println("r_num["+i+"] = " + r_num[i]);
		}*/
		////////////////////////루프
		//int w = 0; 
		//while(w<10){
		//user 입력
		
		/*while(true) {
			for(int i = 0;i<u_num.length;i++) {
				System.out.print((i+1)+ "번째 수 : ");
				u_num[i] = sc.nextInt();
			}
			if(u_num[0]!=u_num[1] &&u_num[0]!=u_num[2]&&u_num[1]!=u_num[2]) {
				break;
			}
			System.out.println("같은 숫자를 입력하셨습니다. 다시 입력해주세요");
		}*/
		//비교                         -> 탈출
		/*
		int strike = 0;
		int ball = 0;
		//ball
		for(int i = 0; i<r_num.length;i++) {
			for(int j = 0; j<u_num.length;j++) {
				if(u_num[i]==r_num[j]&&i!=j) {
					ball++;
				}
			}
		}
		for(int i = 0; i<r_num.length;i++) {
			for(int j = 0; j<u_num.length;j++) {
				if(u_num[i]==r_num[j]&&i==j) {
					strike++;
				}
			}
			if(strike >2) {
				clear = true;
				break;
			}	
		}
		System.out.println(strike + " strike "+ ball + " ball입니다.");
		w++;
		if(clear) {
			System.out.println("게임 클리어");
		}else {
			System.out.println("게임오버");
				}
			}
		}
*/
	