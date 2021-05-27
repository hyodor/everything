package main;

import cls.Child1;
import cls.Child2;
import cls.Parent;

public class MainClass {

	public static void main(String[] args) {
		
		Child1 ch1 = new Child1();
		Child2 ch2 = new Child2();
		
		//자식 클래스는 모두 합해서 10명
		/*
		Child1 arr1[] = new Child1[10];
		Child2 arr2[] = new Child2[10];
		
		arr2[0] = new Child2();
		arr1[0] = new Child1();
		arr1[1] = new Child1();
		arr2[1] = new Child2();
		
		for(int i = 0; i<arr1.length;i++) {
			if(arr1[i]!=null) {
				arr1[i].method();
			}
		}
		
		for(int i = 0; i<arr2.length;i++) {
			if(arr2[i] != null) {
				arr2[i].method();
			}
		}
		*/
		///////////////////////////////////
		
		Parent arrPar[] = new Parent[10];
		
		arrPar[0] = new Child2();
		arrPar[1] = new Child1();
		arrPar[2] = new Child1();
		arrPar[3] = new Child2();
		
		Child2 t = (Child2)arrPar[0];
		t.func();
		
		Child1 o = (Child1)arrPar[1];
		o.process();
		
		//instance of
		for(int i = 0; i<arrPar.length;i++) {
			if(arrPar[i]!=null) {
				arrPar[i].method();
				
				if(arrPar[i] instanceof Child1) {
					Child1 co = (Child1)arrPar[i];
					co.process();
				}else if(arrPar[i]instanceof Child2) {
					((Child2)arrPar[i]).func();
				}
			}
		}
	}
}
