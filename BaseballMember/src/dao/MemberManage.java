package dao;

import java.util.Scanner;
import dto.Batter;
import dto.Human;
import dto.Pitcher;

public class MemberManage {
	
		Scanner sc;
		private Human stArray[] =null;
		private int count;
		private int memberNum;
	
		public MemberManage() {
	    	sc = new Scanner(System.in);
			stArray = new Human[20];
			count = 0;
			memberNum = 1001;
		}

		//TODO 1. 선수 정보 입력
		public void insert() {
			System.out.println("지금부터 선수 정보 입력을 시작합니다.");
			System.out.println("포지션이 pitcher[0]입니까? batter[1]입니까?");
			int ps = sc.nextInt();
			System.out.print("선수명>>");
			String name = sc.next();
			//선수번호  1000 -> 투수, 2000 -> 타자
			System.out.print("선수 나이>>");
			int age = sc.nextInt();
			System.out.print("선수 신장>>");
			int height = sc.nextInt();
				if(ps==0) {
					System.out.println("지금부터 pitcher 정보 입력을 시작합니다.");
					System.out.print("승>>");
					int win = sc.nextInt();
					System.out.print("패>>");
					int lose = sc.nextInt();
					System.out.print("방어율>>");
					double defense = sc.nextDouble();
					stArray[count] = new Pitcher(memberNum, name,age,height,win,lose,defense);
					System.out.println(stArray[count]);
				}else if(ps==1) {
					System.out.println("지금부터 batter 정보 입력을 시작합니다.");
					System.out.print("타수>>");
					int tasu = sc.nextInt();
					System.out.print("안타수>>");
					int antasu = sc.nextInt();
					System.out.print("타율>>");
					double avg = sc.nextDouble();
					stArray[count] = new Batter(memberNum+1000, name,age,height,tasu, antasu, avg);
					System.out.println(stArray[count]);
				}
				
				count ++;
				memberNum++;
		}
		//TODO search 함수 추가
		public int search(String name) {
				int index = -1;
				for(int i = 0; i<stArray.length;i++) {
					if(stArray[i]!=null&&!stArray[i].getName().equals("")) {
						if(name.equals(stArray[i].getName())) {
							index = i;
							break;
						}
					}
				}
				return index;
			}
			
		//TODO 2. 선수 정보 삭제
		public void delete() {
				System.out.print("삭제할 선수 이름 : " );
				String name = sc.next();
				
				int index = search(name);
				if(index == -1) {
					System.out.println("선수 데이터를 찾지 못했습니다.");
					return;
				}else {
					System.out.println(stArray[index].toString());
				}
				stArray[index].setNumber(0);
				stArray[index].setName("");
				stArray[index].setAge(0);
				stArray[index].setHeight(0);
				System.out.println("선수 데이터를 삭제했습니다.");
			}
			
		//TODO 3. 선수 정보 검색
		public void select() {
			System.out.println("검색할 선수의 이름을 입력하세요");
			String wanted = sc.next();
			int index = search(wanted);
			if(index == -1) {
				System.out.println("존재하지 않는 선수입니다. 다시 검색하세요");
				return;
			}else {
				System.out.println(stArray[index].toString());
			}
		}
		//TODO 4. 선수 정보 수정
			public void update() {
				System.out.print("수정할 선수 이름 : " );
				String name = sc.next();
			
				int index = search(name);
				if(index != -1) {
					System.out.println("지금부터 " + name + "의 정보를 수정하겠습니다.");
				}else {System.out.println("해당되는 선수가 없습니다.");
				}
					
					if(stArray[index] instanceof Pitcher) {
						
						Pitcher p = (Pitcher)stArray[index];
						
						System.out.print("승 : ");
						int win = sc.nextInt();
						
						System.out.print("패 : ");
						int lose = sc.nextInt();
						
						System.out.print("방어율 : ");
						double defense = sc.nextDouble();
						
						p.setWin(win);
						p.setLose(lose);
						p.setDefense(defense);
						System.out.println("Pitcher 데이터를 수정하였습니다.");
						
					}
					else if(stArray[index]instanceof Batter) {
						
						Batter b = (Batter)stArray[index];
						
						System.out.print("타수 : ");
						int tasu = sc.nextInt();
						
						System.out.print("패 : ");
						int antasu = sc.nextInt();
						
						System.out.print("방어율 : ");
						double avg = sc.nextDouble();
						
						b.setTasu(tasu);
						b.setAntasu(antasu);
						b.setAvg(avg);
						System.out.println("Batter 데이터를 수정하였습니다.");
					}
			}
			
		//TODO 모든 선수 불러오기
			public void allPrint() {
				for(int i = 0; i<stArray.length;i++) {
					if(stArray[i] != null&&!stArray[i].getName().equals("")) {
						System.out.println(stArray[i].toString());
			}
		}
	}
}
	
