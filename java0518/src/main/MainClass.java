package main;

import cls.ChildClass;
import cls.ParentsClass;

public class MainClass {

	public static void main(String[] args) {
		/*
		ChildClass cc = new ChildClass('A');
		
		ChildClass cc1 = new ChildClass(111, "성춘향");
		
		System.out.println(cc1.getName());
		
		cc1.parentMethod();
		*/
		ParentsClass pc = new ChildClass();
		pc.parentMethod();
	}

}
