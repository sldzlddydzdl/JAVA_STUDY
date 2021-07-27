package stream;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer customer1 = new Customer("김동현", 30, 1500);
		Customer customer2 = new Customer("이우현", 35, 2500);
		Customer customer3 = new Customer("석창희", 40, 3500);
		
		List<Customer> list  = new ArrayList<Customer>();
		
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		
		
		System.out.println("고객 명단 출력");
		list.stream().map(s->s.getName()).forEach(s->System.out.println(s));
		
		System.out.println("여행비용");
		System.out.println(list.stream().mapToInt(s->s.getPrice()).sum());
		
		System.out.println("35세 이상 이름순 정렬");
		list.stream().filter(s->s.getAge() >= 35).map(s->s.getName()).sorted().forEach(s->System.out.println(s));
		
		
		
		
	}

}
