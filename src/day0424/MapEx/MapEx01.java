package day0424.MapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx01 {
	
	public static void main(String[] args) {
		// 사전과 같은 자료 구조
		// 키(key) 에 값(value) 이 매핑된다.
		// key : value 이루어진 구조
		
		// key는 중복을 허용하지 않는다. 따라서 set으로 받아볼 수 있음.
		
		Map<Integer, String> foodMap = new HashMap<>();
		// 자장면, 짬뽕, 볶음밥
		
		// 추가 put( 키 , 값 );
		foodMap.put(0, "자장면");
		foodMap.put(1, "짬뽕");
		foodMap.put(2, "볶음밥");
		
		// 꺼낼때 get(키)
		System.out.println(foodMap.get(0));
		System.out.println(foodMap.get(1));
		System.out.println(foodMap.get(2));
		
		for(int i = 0; i < foodMap.size(); i++) {
			System.out.println(foodMap.get(i));
		}
		
		// 탕수육을 키가 5인 번호에 넣자
		foodMap.put(5, "탕수육");
		for(Integer num : foodMap.keySet())
			System.out.println(foodMap.get(num));
		
		// 키만 꺼내느 방법!
		Set<Integer> keys = foodMap.keySet();
		for(int k : keys) {
			System.out.println(foodMap.get(k));
		}
		
		// 키가 같을 때 value를 다른 값으로 넣는다면?
		foodMap.put(0, "멘보샤");
		System.out.println(foodMap);
		
		// 쌍으로 꺼내는 방법!!
		// entry라는 자료형으로 꺼냄 key, value 형태
		Set<Entry<Integer, String>> entrySet = foodMap.entrySet();
		for(Entry<Integer, String> e : entrySet) {
			// key , value
			System.out.println(" 키 : " + e.getKey());
			System.out.println(" 값 : " + e.getValue());
		}
		
		
		for(Integer num : foodMap.keySet())
			System.out.println("키 : " + num + " 값 : " + foodMap.get(num));
		
		
		
	}
}
