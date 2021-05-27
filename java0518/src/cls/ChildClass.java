package cls;

public class ChildClass extends ParentsClass {
	
	private int number;
	
	public ChildClass() {
		System.out.println("ChildClass ChildClass()");
	}
	
	public ChildClass(char c) {
		//this(); // 자기 참조 주소
		
		/*
		 * super();
		 * 부모 클래스의 인스턴스
		 * 
		 */
		super(123);
		super.name = "성춘향";
		
		System.out.println("ChildClass ChildClass(char c)");
		
	}
	
	public ChildClass(int number, String name) {
		super(name);
		this.number = number;
		System.out.println("ChildClass ChildClass(int number, String name)");
		
	}
	
	public void parentMethod() {
		//super.parentMethod();
		System.out.println("ChildClass parentMethod()");
	}
}



