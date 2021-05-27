package may0518;

public class ParentsClass /*extends Object*/{
	
	protected String name;
	
	/*
	 * private
	 * public
	 * protected : 자식 클래스에서 접근을 허용하겠다. 
	 * 
	 */
	
	public void parentMethod() {
		System.out.println("ParantClass parentMethod()");
	}
}
