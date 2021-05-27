package cls;

public class ParentsClass  {
	
	protected String name;
	
	public ParentsClass() {
		
		System.out.println("ParentClass ParentClass()");
	}
	
	public ParentsClass(int number) {
		System.out.println("ParentClass ParentClass(int number)");
	}
	
	public ParentsClass(String name) {
		this.name = name;
		System.out.println("ParentClass ParentClass(String name)");
	}
	
	public String getName() {
		return name;
	}
	
	/* 
	 * Override : 상속 받은 클래스에서 고쳐 기입하는 것
	 * 
	 */
	
	public void parentMethod() {
		System.out.println("ParentClass parentMethod()");
	}
}
