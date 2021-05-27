package baseball0520;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import arrayList0518.MyClass;

public class MemberManage {
	
		Scanner sc;
		//private Human stArray[] =null;
		private ArrayList<Human> list = new ArrayList<Human>();
		private int count;
		private int memberNum;
		
		private DataProcess dp;
	
		public MemberManage() {
			sc = new Scanner(System.in);
			//stArray = new Human[20];
			
			dp = new DataProcess("ArrayLionsSave");
			dp.createFile();
			dataLoad();
			
			int lastIndexNumber = 0;
			for(int i = 0; i<list.size();i++) {
				if(list.get(i).getName()!="null") {
					lastIndexNumber = i;
				}
			}
			if(lastIndexNumber>0) {
				memberNum = 1001 + list.get(lastIndexNumber).getNumber()%1000;
				count = lastIndexNumber + 1;
			}else {
				count = 0; 
				memberNum = 1001;
			}
	    
			/*
			stArray[0] = new Pitcher(1001, "홍길동", 24, 172, 10, 3, 0.23);
			stArray[1] = new Batter(2002, "성춘향", 17, 165, 12, 3, 0.301);
			stArray[2] = new Pitcher(1003, "홍두께", 21, 181, 6, 1, 0.212);
			stArray[3] = new Pitcher(1004, "성춘향", 15, 156, 11, 0, 0.100);
			
			count =3; 
			memberNum=1004;
			*/
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
					list.add(new Pitcher(memberNum, name,age,height,win,lose,defense));
					for(int i = 0; i<list.size();i++) {
						Human m = list.get(i);
						System.out.println(m.toString());
					}
					
				}else if(ps==1) {
					System.out.println("지금부터 batter 정보 입력을 시작합니다.");
					System.out.print("타수>>");
					int tasu = sc.nextInt();
					System.out.print("안타수>>");
					int antasu = sc.nextInt();
					System.out.print("타율>>");
					double avg = sc.nextDouble();
					list.add(new Batter(memberNum+1000, name,age,height,tasu, antasu, avg));
					for(int i = 0; i<list.size();i++) {
						Human m = list.get(i);
						System.out.println(m.toString());
					}
				}
				
				count ++;
				memberNum++;
		}
		//TODO search 함수 추가
		public int search(String name) {
				int index = -1;
				for(int i = 0; i<list.size();i++) {
					if(list.get(i)!=null && !list.get(i).getName().equals("")) {
						if(name.equals(list.get(i).getName())) {
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
					for(int i = 0; i<list.size();i++) {
					Human m = list.get(i);
					System.out.println(m.toString());
					}	
				}
				list.get(index).setNumber(0);
				list.get(index).setName("");
				list.get(index).setAge(0);
				list.get(index).setHeight(0);
				System.out.println("선수 데이터를 삭제했습니다.");
			}
			
		//TODO 3. 선수 정보 검색
		public void select() {
			System.out.println("검색할 선수의 이름을 입력하세요");
			String name = sc.next();
			int count = 0;
				// 입력된 이름의 선수가 몇명?
					for (int i = 0; i < list.size(); i++) {
						if(list.get(i)!= null && !list.get(i).getName().equals("")) {
							if(name.equals(list.get(i).getName())) {
								count++;
							}
						}
					}
						
					if(count < 1) {
						System.out.println("검색된 선수가 없습니다");
						return;
					}
						
					Human hman[] = new Human[count];
					int len = 0;
					for (int i = 0; i < list.size(); i++) {
						if(list.get(i) != null && !list.get(i).getName().equals("")) {
							if(name.equals(list.get(i).getName())) {
								hman[len] = list.get(i);
								len++;
							}
						}
					}
						
				// 출력
					for (int i = 0; i < hman.length; i++) {
						System.out.println(hman[i].toString());	
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
					
					if(list.get(index)instanceof Pitcher) {
						
						Pitcher p = (Pitcher)list.get(index);
						
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
					else if(list.get(index)instanceof Batter) {
						
						Batter b = (Batter)list.get(index);
						
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
			
		//TODO 5. 모든 선수 불러오기
			public void allPrint() {
				for(int i = 0; i<list.size();i++) {
					if(list.get(i)!= null&&!list.get(i).getName().equals("")) {
						System.out.println(list.get(i).toString());
			}
		}
	}
			
		//TODO 6. 파일에 저장하기
			public void dataSave() {
				//1001-홍길동-24-180-10-2-0.23
				int len = 0;
				for(int i = 0; i<list.size();i++) {
					if(list.get(i)!= null&&!list.get(i).getName().equals("")) {
						len++;
				}
			}
				if(len == 0 ) {
					System.out.println("저장할 데이터가 없습니다.");
				}
				ArrayList<Human> filelist = new ArrayList<Human>();
				int w = 0;
				for(int i = 0; i<list.size();i++) {
					if(list.get(i) != null&&!list.get(i).getName().equals("")) {
						filelist.add(list.get(i));
						w++;
			}
		}
				for(int i = 0 ; i<filelist.size();i++) {
					System.out.println(filelist.get(i));
				}
				dp.fileSave(filelist);
			}
	
			public void dataLoad() {
				ArrayList filelist = dp.fileLoad();
				ArrayList<Human> filelist1 = new ArrayList<Human>();
				for(int i = 0 ; i<filelist1.size();i++) {
					String data[] =filelist1.get(i).toString().split("-");
					int pos = Integer.parseInt(data[0]);
					if(pos<2000) {
						list.add(new Pitcher(Integer.parseInt(data[0]), 
								                                           data[1],
								                                           Integer.parseInt(data[2]),
								                                           Integer.parseInt(data[3]),
								                                           Integer.parseInt(data[4]),
								                                           Integer.parseInt(data[5]),
								                                           Double.parseDouble(data[6])));
					}else { 
						list.add(new Batter(Integer.parseInt(data[0]), 
									                                        data[1],
									                                        Integer.parseInt(data[2]),
									                                        Integer.parseInt(data[3]),
									                                        Integer.parseInt(data[4]),
									                                        Integer.parseInt(data[5]),
									                                        Double.parseDouble(data[6])));
			}
		}
	}
}