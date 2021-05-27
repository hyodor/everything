package may12;

public class Functionex1 {

	public static void main(String[] args) {
		int num1, num2;
		int result, tag[];//몫, 나머지
		
		num1 = 9;
		num2 = 2;
		
		tag = new int[1];
		
		//두 수의 몫과 나머지를 구할 수 있는 함수를 작성하라. 하나만 작성
		result = funcEx1(num1, num2, tag);
		System.out.println("몫 : " + result);
		System.out.println("나머지 : " + tag[0]);
		
	}
	
	static int funcEx1(int n1, int n2, int []t) {
		int r;
		r = n1/n2;
		t[0] = n1%n2;
		
		return r;
	}
}
