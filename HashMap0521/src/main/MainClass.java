package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * HashMap : 사전
		 * 			key : value -> 1 pair(한 쌍)
		 * 			key로 관리한다. (key는 중복이 허용되지 않는다)
		 * 			Tree구조로 되어있다(탐색 속도가 빠름)
		 * 
		 * 			java(back-end) <--> web(front-end)
		 * 			map 				json(key : value)
		 *
		 * TreeMap : HashMap + Sorting
		 * 
		 */

		HashMap<Integer, String> hmap = new HashMap<>();
		
		//추가
		hmap.put(11, "십일");
		hmap.put(22, "이십이");
		hmap.put(33, "삼십삼");
		
		System.out.println(hmap.size());
		System.out.println(hmap);
		
		String value = hmap.get(11);//get()안에 들어가는 것은 key값임
		System.out.println(value);
		
		//삭제
		value = hmap.remove(22);
		System.out.println(value); //어떤 값을 삭제한건지 확인 가능
		
		//검색(있다/없다)
		boolean b = hmap.containsKey(22);
		if(b == true) {
			String s = hmap.get(22);
			System.out.println(s);
		}else {
			System.out.println("존재하지 않는 값입니다.");
		}

		//수정
		
		hmap.replace(11,"십 + 일");
		System.out.println(hmap.get(11));
		
		hmap.put(11, "십 플러스 일"); // 추가가 되지 않고 수정이 되어버림
		System.out.println(hmap.get(11));
		
		//모두 출력
		
		Iterator<Integer> it = hmap.keySet().iterator();
		
		while(it.hasNext()) {
			Integer key = it.next();
			String val = hmap.get(key);
			System.out.println("key : " + key + " value : " + val);
		}
		/////////////HashMap
			
		HashMap<String, String>map = new HashMap<String, String>();
		map.put("apple", "사과");
		map.put("pear", "배");
		map.put("grape", "포도");
		map.put("banana", "바나나");
		map.put("orange", "오렌지");
		
		Iterator<String> it1 = map.keySet().iterator();
		while(it1.hasNext()) {
			String key1 = it1.next();
			String val1 = map.get(key1);
			System.out.println(key1 + " : " + val1);
		}
		System.out.println("\n");
		/////////////TreeMap
		TreeMap<String, String>tmap = new TreeMap<String, String>(map);
		
		//오름차순
		Iterator<String>itkey = tmap.keySet().iterator();
		while(itkey.hasNext()) {
			String key2 = itkey.next();
			String val2 = tmap.get(key2);
			
			
			System.out.println(key2 + " : " + val2);
		}
		System.out.println("\n");
		//내림차순
		
		Iterator<String>itkey2 = tmap.descendingKeySet().iterator();
		while(itkey2.hasNext()) {
			String key3 = itkey2.next();
			String val3 = tmap.get(key3);
			
			
			System.out.println(key3 + " : " + val3);
		}
		System.out.println("\n");
		 
		//오름차순, 내림차순으로 sorting하더라도 원본 데이터에는 영향을 주지 않는다. 
		
	}
}

