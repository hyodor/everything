package may12;

import java.util.Scanner;

public class Calculator_t {
	public static void main(String[] args) {
		
		int num1, num2;
		String oper;
		
		// 첫번째 수 입력
		num1 = number_input("첫번째");
		
		// 연산자를 입력
		oper = operatorInput();
		
		// 두번째 수 입력	/ + 0 우선은 무시
		num2 = number_input("두번째");
		
		// 연산
		int result = processing(num1, num2, oper);
		
		// 결과출력	
		resultPrint(num1, num2, result, oper);		
	}
	
	// 입력 함수들
	static int number_input(String no) {
		Scanner sc = new Scanner(System.in);
	
		String numStr = "";
		while(true) {
			System.out.print(no + " 수 >> ");
			numStr = sc.nextLine();
			
			if(numStr.equals("") == true) {
				System.out.println("숫자를 정확하게 입력해 주십시오");
				continue;
			}		

			boolean check = isNumber(numStr); 					
			if(check == false) {
				System.out.println("문자가 포함되어 있습니다. 숫자를 다시 기입해 주십시오");
				continue;
			}
			
			System.out.println("모두 숫자로 되어있습니다");
			break;			
		}
		
		int num = Integer.parseInt(numStr);		
		return num;
	}
	
	static String operatorInput() {
		Scanner sc = new Scanner(System.in);
		String oper = "";
		while(true) {
			System.out.print("연산자(+, -, *, /) >> ");
			oper = sc.nextLine();
			if(oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/")) {
				System.out.println("정상적인 연산자 입력");
				break;
			}
			
			System.out.println("정확한 연산자를 입력해 주십시오");
		}
		
		return oper;
	}
	
	// util
	static boolean isNumber(String numStr) {
		boolean check = true;
		for (int i = 0; i < numStr.length(); i++) {
			char c = numStr.charAt(i);
			int asc = (int)c;
			if(asc < 48 || asc > 57) {
				check = false;
				break;
			}
		}		
		return check;
	}

	// 연산처리
	static int processing(int n1, int n2, String oper) {
		int result = 0;
		switch(oper) {
			case "+":
				result = n1 + n2;
				break;
			case "-":
				result = n1 - n2;
				break;
			case "*":
				result = n1 * n2;
				break;
			case "/":
				result = n1 / n2;
				break;		
		}
		
		return result;
	}
	
	// 결과출력
	static void resultPrint(int n1, int n2, int result, String oper) {
		System.out.println(n1 + " " + oper + " " + n2 + " = " + result);		
	}
}
