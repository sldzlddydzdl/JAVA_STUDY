package day0424.setEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setEx01 {
	// Set 인터페이스
	// HashSet, TreeSet 클래스
	
	// HashSet
	// 순서가 일정하지 않은 단점이 있다.
	// 속도가 빠르다는 장점이있다.
	
	// 정렬이 필요한 상황이라면 TreeSet을쓴다.
	
	// 원소들의 순서는 사입되었던 순서와 같다.
	// LinkedHashSet 을 쓴다.
	
	
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		numbers.add(8);
		numbers.add(10);
		
		// 2, 4, 6 ,8 ,10
		
		// 전체를 꺼내는 방법!
		Iterator<Integer> it = numbers.iterator();
		
		// it.hasNext() 꺼낼 것이 있는가?
		while(it.hasNext()) {
			// it.next() 다음 순서에 있는 아이를 반환.
			System.out.println(it.next());
		}
		
		System.out.println("------------------------");
		// 3의 30보다 작은 3의 배수를 set number3에 담으시오.
		Set<Integer> number3 = new HashSet<>();
		
		System.out.println("3의 배수");
		for(int i = 1 ; i < 28; i++) {
			if(i % 3 == 0) {
				number3.add(i);
				System.out.print( i + " ");
			}
		}
		System.out.println();
		
		System.out.println("2의 배수");
		for(int i = 1 ; i < 28; i++) {
			if(i % 2 == 0) {
				numbers.add(i);
				System.out.print( i + " ");
			}
		}
		System.out.println();
//		
//		Iterator<Integer> it3 = number3.iterator();
//		
//		while(it3.hasNext()) {
//			System.out.println(it3.next());
//		}
//				
//		System.out.println("------------------------");
//		
//		for(Integer num : number3)
//			System.out.println(num);
//		
//		
		
		// 합집합
		Set<Integer> hap = new HashSet<>(numbers);
		hap.addAll(number3);
		System.out.println("합집합");
		for(int num : hap) 
			System.out.print(num + " ");
		System.out.println();
		
		// 차집합
		Set<Integer> cha = new HashSet<>(numbers);
		cha.removeAll(number3);
		System.out.println("2의 배수에차집합");
		for(int num : cha)
			System.err.print(num + " ");
		System.out.println();
		
		// 교집합
		Set<Integer> ko = new HashSet<>(numbers);
		ko.retainAll(cha);
		System.out.println("교집합"); // 중복된 애들만 뺀다.
		for(int num : ko) {
			System.out.print(num + " ");
		}
	}
	
	
}
