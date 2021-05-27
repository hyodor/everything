package main;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * ArrayList : 선형구조 0 - 0 - 0 - 0 - 0
		 * 				검색, 대입
		 * LinkedList : 실시간 추가 삭제가 빈번하게 일어날 때 
		 */
		/*	
		ArrayList<Object> alist = new ArrayList<Object>();
		
		String str = "Tigers";
		Integer in = 123;
		
		alist.add(str);
		alist.add(in);
		
		System.out.println(alist.toString());
		*/
		
		ArrayList <Object> alist = new ArrayList <Object>();
		
		alist.add("tigers");
		
		String str = new String("lions");
		
		alist.add(str);
		alist.add(new String("twins"));
		
		LinkedList<Object> linklist = new LinkedList<Object>(alist);
		
		for(Object obj : linklist) {
			System.out.println((String) obj);
		}
		
		//맨 앞의 요소(element)를 추가
		linklist.addFirst("bears");
		
		// 맨 뒤의 요소(element)를 추가
		linklist.addLast("hey");
		
		for(Object obj : linklist) {
			System.out.println((String) obj);
		}
		
	}

}
