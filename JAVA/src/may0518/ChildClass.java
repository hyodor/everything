package may0518;

public class ChildClass extends ParentsClass {
	
	private int number;
	
	public void childFunc() {
		parentMethod();
		
		name = "홍길동";
		//private String name으로 해놓으면 ParentsClass가 보이지 않는다고 함, 그러나 있기는 하기 때문에 색은 파란색임. 
		//외부에서는 접근을 차단한다. 
	
		System.out.println("ChildClass childFunc()");
	}

}
