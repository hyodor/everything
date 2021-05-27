package baseball0520;

public class Human {
	
	private int number;
	private String name;
	private int age;
	private int height;
	
	public Human(){
		
	}
	
	public Human(int number, String name, int age, int height) {
		
		this.number = number;
		this.name = name;
		this.age = age;
		this.height = height;
		// TODO Auto-generated constructor stub
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return number + "-" + name + "-" + age + "-"+ height ;
	}	

}