package main;

import java.util.Scanner;

import dao.MemberManage;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MemberManage mm = new MemberManage();
		
		while(true) {
			System.out.println("어떤 업무를 원하십니까?");
			System.out.println("1. 선수 추가");
			System.out.println("2. 선수 삭제"); //이름 스캐너
			System.out.println("3. 선수 검색"); //이름 스캐너
			System.out.println("4. 선수 수정"); // 승, 패, 방어율
			System.out.println("5. 전체 출력");
			System.out.print("원하는 업무의 번호를 입력하세요");
			int key = sc.nextInt();
			switch(key){
				case 1:
					System.out.println("1. 선수 추가");
					mm.insert();
					break;
				case 2 : 
					System.out.println("2. 선수 삭제");
					mm.delete();
					break;
				case 3 :
					System.out.println("3. 선수 검색");
					mm.select();
					break;
				case 4 : 
					System.out.println("4. 선수 수정");
					mm.update();
					break;
				case 5 : 
					System.out.println("모든 데이터를 불러옵니다.");
					mm.allPrint();
					break;
				default : System.out.println("올바르지 않은 입력값입니다. 다시 입력해주세요");
			}
		}
	}
}
