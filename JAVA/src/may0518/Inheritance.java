package may0518;

public class Inheritance {

	public static void main(String[] args) {
		
		ChildClass cc = new ChildClass();
		
		cc.childFunc();
		System.out.println("///");
		cc.parentMethod();
		
		cc.name = ""; //같은 패키지 안에서는 에러 나지 않고 인식됨
		
	}

}
