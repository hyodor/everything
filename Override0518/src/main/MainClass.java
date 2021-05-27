package main;

import cls.Child;
import cls.Parent;

public class MainClass {
	public static void main(String[] args) {
	Child c = new Child();
	c.pMethod();
	c.pProcess();
	c.func();
	
	Parent p = new Child();
	p.pMethod();
	p.pProcess();//이건 출력됨
	//p.func();//이건 출력안됨
	
	Child cd = (Child)p;
	cd.func(); // 이때부터는 출력됨
	}
}
