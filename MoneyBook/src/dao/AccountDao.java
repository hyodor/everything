package dao;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import dto.AccountDto;

public class AccountDao {
	
	Scanner sc;
	private HashMap<Calendar,AccountDto> map;
	//private int count;
	//private int memberNum;

	public AccountDao() {
    	sc = new Scanner(System.in);
    	map = new HashMap<Calendar, AccountDto>();
		//count = 1;
    	//memberNum = 1001;
	}
	
	//TODO 1. 추가
	public void insert() {
		System.out.println("지금부터 가계부에 입력을 시작합니다. 수입입니까[1]? 아니면 지출입니까[2]?");
		int classify = sc.nextInt();
		//수입
		if(classify ==1) {
		System.out.println("먼저 연도를 입력하세요");
		int year = sc.nextInt();
		System.out.println("몇 월인가요?");
		int month = sc.nextInt();
		System.out.println("몇 일이었는지 알려주세요");
		int date = sc.nextInt();
		Calendar c = Calendar.getInstance();
		c.set(year,month,date);
		
		System.out.println("얼마를 버셨나요?");
		int money = sc.nextInt();
		System.out.println("어떻게 획득하셨나요?");
		String use = sc.next();
		System.out.println("메모하실 게 있나요? 없다면 없음을 적어주세요");
		String memo = sc.next();
		AccountDto ad = new AccountDto(c,use,classify, money,memo );
		map.put(c,ad);
	
		Iterator<Calendar> it = map.keySet().iterator();
		while(it.hasNext()) {
			Calendar key = it.next();
			AccountDto val = map.get(key);
			System.out.println(key + " : " + val);
		
		}
		
		//지출
		}else if(inoutcome ==2) {
		
			System.out.println("먼저 연도를 입력하세요");
			int year = sc.nextInt();
			System.out.println("몇 월인가요?");
			int month = sc.nextInt();
			System.out.println("몇 일이었는지 알려주세요");
			int date = sc.nextInt();
			
			Calendar c = Calendar.getInstance();
			c.set(year,month,date);
			//date.set(Calendar.ALL_STYLES,day);
			
			System.out.println(c.get(date)+ "일에 얼마를 버셨나요?");
			int money = sc.nextInt();
			System.out.println("어떻게 획득하셨나요?");
			String use = sc.next();
			map.put(c,new AccountDto());
		
			Iterator<Calendar> it = map.keySet().iterator();
			while(it.hasNext()) {
				Calendar key = it.next();
				AccountDto val = map.get(key);
				System.out.println(key + " : " + val);
			}
		}
	}
	//search 함수
	public int search(String use) {
		int index = -1;
		Iterator<Calendar> it = map.keySet().iterator();
		while(it.hasNext()) {
			Calendar key = it.next();
			AccountDto val = map.get(key);
			System.out.println("key : " + key + " value : " + val);
			//if(map!=null&&!value.equals("")) {
			
				if(use.equals(val)) {
					index = calendar;
					break;
				}
			}
		//}
		System.out.println("index : " + index);
		return index;
	}
	
	//TODO 2. 삭제
	public void delete() {
			System.out.print("삭제할 수입/지출 내역 : " );
			String use = sc.next();
			
			int index = search(use);
			System.out.println(index);
			if(index == -1) {
				System.out.println("해당하는 데이터를 찾지 못했습니다.");
				return;
			}else {
				System.out.println(map.get(index).toString());
			}
			map.remove(index);
			System.out.println("해당 데이터를 삭제했습니다.");
	}
	
	//TODO 3. 검색
	public void select() {
	
	}
	// - 연도, 월, 일을 검색하면 : 그 날의 수입지출 내역을 알려줘야함
	// - 지출, 수입을 검색하면 : 
	// - 내용을 검색하면 : 그 지출 내역을 알려줘야함 
	
	//TODO 4. 수정
	public void update() {
		
		System.out.print("수정할 내역 : " );
		String use = sc.next();
	
		int index = search(use);
		if(index != -1) {
			System.out.println("지금부터 " + use + " 을 수정하겠습니다.");
		}
				//System.out.println("금액 : ");
				//int money1 = sc.nextInt();
				System.out.print("바꿀 용도 : ");
				String use1 = sc.next();
				map.replace(c, use1);
				
				System.out.println("데이터를 수정하였습니다.");
				System.out.println(map.get(index));
				System.out.println(map);
	
	}
	
	//TODO 5. 모든 데이터 출력
	public void allPrint() {
		
	Iterator<Calendar> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			Calendar key = it.next();
			AccountDto val = map.get(key);
			System.out.println("수입/지출 금액: " + key + "원" + " 용도 : " + val);
		}
	}
	
	//TODO 6. 파일에 저장
	public void fileSave() {
		
		}
	}
