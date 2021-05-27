package main;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * final : const, define
		 * 		변수, 함수, 클래스에도 적용이 된다. 
		 */
		
		final int NUMBER = 1; // 변수 -> 상수(변경 x) 대입용 , 대문자로 작성
		
		//NUMBER = 2; 바꿀 수 없음, 상수이기 때문에
		
		int num = NUMBER;
		
	}

}

/*final*/ class SuperClass{//The type ChildClass cannot subclass the final class SuperClass
						   //상속 금지
	public /*final*/ void method() {//Cannot override the final method from SuperClass 
									//Override 금지
	}
}

class ChildClass extends SuperClass { 
	public void method() {
		
	}
	
}