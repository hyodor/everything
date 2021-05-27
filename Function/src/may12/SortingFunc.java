package may12;

import java.util.Scanner;

public class SortingFunc {

	public static void main(String[] args) {
		int number[];
		boolean updown[] = new boolean[1];
	
		//TODO : 1.입력
		number = number_input(updown);
		
		//TODO : 2.정렬 처리
			//swap
		
		sorting(number, updown[0]);
		
		//TODO : 3.결과 출력
		
		resultPrint(number,updown[0]);
		
	}
			static int[] number_input(boolean[]updown) {
				Scanner sc = new Scanner(System.in);
					updown[0] = false;
						System.out.println("몇 개의 숫자를 정렬하시겠습니까?");
					int count = sc.nextInt();
					int number[] = new int [count];
						System.out.println("정렬할" + count + "개의 숫자를 입력해주세요");
		
				for(int i =0; i<number.length; i++) {
					number[i]=sc.nextInt();
				}System.out.println("오름차순(1)으로 할까요? 내림차순(2)로 할까요?");
	
				int ud = sc.nextInt();
				if(ud ==1) {
					updown[0]=true; 
				}else if(ud==2) {
					updown[0]=false;
				}
				sc.close();
				return number;
				}

			static void sorting(int number[],boolean updown) {	
	
				for (int i = 0; i<number.length; i++) {
					for(int j = i+1;j<number.length;j++) {
						if(updown ==true) {
							if(number[i]>number[j]) {
								swap(number, i, j);
							}
						}else if (updown ==false) {
							if(number[i]<number[j]) {
								swap(number, i, j);
							}
						}
					}
				}
			}
			static void swap(int number[],int i, int j) {
				int temp = number[i];
				number[i] = number[j];
				number[j] = temp;
			}
			static void resultPrint(int number[],boolean updown) {
				if(updown ==true) {
					System.out.println("오름차순으로 정렬하였습니다.");
				}else if(updown ==false) {
					System.out.println("내림차순으로 정렬하였습니다.");
					for(int i =0; i<number.length;i++) {
						System.out.println(number[i]);
						}
					}
				}
			}

