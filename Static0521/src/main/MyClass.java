package main;

public class MyClass {
	
	int number; //(instance) 멤버변수 -> Heap
	
	static int staticVar; //전역(global)변수 -> static영역에 올라감, 초기화를 하지 않아도 자동적으로 0이 됨
	
	public void method(int num) {
		int number; //지역(local)변수 -> Stack
		
		//staticVar = 1;
	}
	
	public void function() {
		int localVar = 0;
		
		localVar++;
		number++;
		MyClass.staticVar++;
	
		System.out.println("localVar : " + localVar);
		System.out.println("number : " + number);
		System.out.println("staticVar : " + staticVar);
	}
	
	public static void StaticMethod() {
		//number = 12; 이런식으로 멤버 변수는 접근이 불가함
		System.out.println("MyClass StaticMethod()");	
		System.out.println("///");
	}
	
	public static MyClass getInstance() {
		MyClass cls = new MyClass();
		//cls.method(3);
		cls.function();
		
		return cls;
	}
}
