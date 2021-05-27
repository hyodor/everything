import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		//선언부
		Scanner sc = new Scanner(System.in);
		int r_num[] = new int[3];
		int u_num[] = new int[3];
		boolean clear ; 
		//초기화
		clear = false;
		//random 할당
		while(true) {
			r_num[0] = (int)(Math.random()*9) +1;
			r_num[1] = (int)(Math.random()*9) +1;
			r_num[2] = (int)(Math.random()*9) +1;
			
			if(r_num[0]!=r_num[1]&&r_num[0]!=r_num[2]&&r_num[1]!=r_num[2]) {
				break;
			}
		}
		for(int i = 0; i<r_num.length;i++){
			System.out.println("r_num["+i+"] = " + r_num[i]);
		}
		////////////////////////루프
		int w = 0; 
		while(w<10){
		//user 입력
		while(true) {
			for(int i = 0;i<u_num.length;i++) {
				System.out.print((i+1)+ "번째 수 : ");
				u_num[i] = sc.nextInt();
			}
			if(u_num[0]!=u_num[1] 
					&&u_num[0]!=u_num[2]
							&&u_num[1]!=u_num[2]) {
				break;
			}
			System.out.println("같은 숫자를 입력하셨습니다. 다시 입력해주세요");
		}
		//비교                         -> 탈출
		int strike = 0;
		int ball = 0;
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
			System.out.println("게임오버, 다시 도전하세요");
			
				}
			}
		}
	}

	