package main;

import java.util.Scanner;
import dao.AccountDao;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		AccountDao ad = new AccountDao();
		
		while(true) {
			System.out.println("건강한 소비습관을 형성하는 가계부입니다!");
			System.out.println("1.수입/지출 내역 추가");
			System.out.println("2.수입/지출 내역 삭제");
			System.out.println("3.수입/지출 내역 검색");
			System.out.println("4.수입/지출 내역 수정");
			System.out.println("5.전체 수입/지출 내역 출력");
			System.out.println("6.가계부 파일에 저장");
			System.out.println("원하는 항목을 선택하세요");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				ad.insert();
				break;
			case 2 : 
				ad.delete();
				break;
			case 3 : 
				ad.select();
				break;
			case 4 : 
				ad.update();
				break;
			case 5 :
				ad.allPrint();
				break;
			case 6 : 
				ad.fileSave();
				break;
				default : System.out.println("잘못된 값을 입력하였습니다. 다시 입력해주세요");
			}
		}
	}
}
	
