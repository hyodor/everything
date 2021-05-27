package main;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * static 정적인 <--> dynamic 동적인
		 * 변수, 메소드(class는 static에서는 의미가 없음)
		 * 
		 * 	
		 * 
		 */
		//MyClass.staticvar = 1;
		
		MyClass mc = new MyClass();
		mc.function();
		System.out.println("///");
		
		MyClass mc1 = new MyClass();
		mc1.function();
		System.out.println("///");
		mc1.function();
		
		MyClass.StaticMethod(); //클래스명을 따라서 호출당함
		
		MyClass mycls = MyClass.getInstance();
	}

}
