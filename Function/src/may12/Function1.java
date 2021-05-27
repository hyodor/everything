package may12;

public class Function1 {
	
	/*
	 * function : 함수
	 * method : == class 소속 함수
	 * 
	 * 자바 -> 객체지향
	 * C언어 -> 절차지향, 속도 빠르다, 가독성X ==노가다
	 *         C++(C언어에 클래스를 넣는다)
	 *         
	 *         형식 : return값의자료형 함수명 (인수,인자,parameter,매개변수){
	 *         
	 *         //처리
	 *         
	 *         return 돌려주는 값(=return value);
	 *         
	 *          }
	 *          
	 *          parameter -> 대입할 변수명
	 *          argument -> 대입할 실제값
	 */

	public static void main(String[] args) {

		funcName1();
		
		funcName2(3); // argument = 3
		int returnValue = funcName3(6.19f);
		System.out.println("returnValue : " + returnValue);
		//////////////////////////////////////////
		int num = 3; 
		int arr[] = {1,2,3};
		
		funcName4(num,arr);
	
		System.out.println("num : " + num);
		for(int i= 0; i<arr.length;i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		double d = funcName5();
		System.out.println("d : " + d);
		//ex. double r = Math.random(); return 값만 받는 함수
		
		String numStr = "123";
		boolean b = isDouble(numStr);
		if(b) {
			System.out.println("이 문자열은 소수입니다.");
		}else {
			System.out.println("이 문자열은 정수입니다.");
		}
		
		int returnValue2 = charToAscii('a');
		System.out.println("returnValue : " + returnValue2);
	}
	
	static void funcName1() { //매개변수가 없는채로 만들어놓은 함수가 기본형
		System.out.println("funcName() 호출");
	}
	
	static void funcName2(int i) { //i = 가인수(virtual parameter, 가상의 인수)
		System.out.println("funcName1(int i) 호출 : " + i);
		
	}
	
	static int funcName3(float f) {
		System.out.println("funcName3(float f) 호출 : " + f);
		return (int)f;
	}
	                  // value할당 address할당(reference == 참조)
	static void funcName4(int num, int arr[]) {
		num = num * 10;
		for(int i = 0; i<arr.length;i++) {
			arr[i] = arr[i]*10;
		}
	}
	
	static double funcName5() {
			System.out.println("funcName5(float f) 호출");
			
			//초기화 처리
			
			return 123.456;
		}
	
	//문자열 -> 모두 숫자로 되어있는지?
	//      -> 정수? 소수?
	static boolean isDouble(String snum) {
		boolean b = false;
		for(int i = 0; i<snum.length();i++) {
			char c = snum.charAt(i);
			if(c == '.') {
				b = true;
				break;
			}
		}
		return b;
	}
	
	//알파벳 -> 입력
	//return -> 아스키코드가 나온다. 
	
	static int charToAscii(char c) {
		return (int)c;
	}
	
	//숫자 -> 입력
	//return -> 알파벳이 나온다. 
	
	static char asciiToChar(int asc) {
		return(char)asc;
	}
}