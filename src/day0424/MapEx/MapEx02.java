package day0424.MapEx;

import java.util.*;
import java.util.Map.Entry;

public class MapEx02 {

	public static void main(String[] args) {
		// 키가 이름 , 값이 연봉 형태의 맵을 만들어
		// 3명의 데이타를 넣고
		// 모두 꺼내여 출력해보세요
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("김동현", 1500000);
		map.put("김윤아", 2000000);
		map.put("김무열", 8000000);
		map.put("석창희" ,1500000);
		map.put("이우현", 1500000);
		
		for(String key : map.keySet()) 
			System.out.println("키 : " + key + "         값 : " + map.get(key));
		
		Set<Entry<String , Integer>> entrySet = map.entrySet();
		for(Entry<String , Integer> e : entrySet) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		Collection<Integer> col = map.values();
		for(Integer num1 : col)
			System.out.println(num1);
		
		// 1. set 을 이용하여
		// 로또번호를 생성하여 출력하시오.
		// 1~45 까지의 숫자 6개가 중복없이 만들어서 출력하는 코드.
		
		Random ra = new Random();
		
		Set<Integer> set = new HashSet<>();
		while(set.size() < 6) {
			int num = ra.nextInt(45);
			set.add(num);
		}
		Iterator<Integer> it = set.iterator();
		List<Integer> list = new ArrayList<>();
		while(it.hasNext()) {
			list.add(it.next());
		}
		Collections.sort(list);
		System.out.println(list);
		
		// 2. map 을 이용
		// Employee 클래스를 생성
		// String name, int salary, String address;
		// 키에 사번을 넣고 , value에 Employee 객체을 수 있는 map을 만들어
		// 3명의 객체를 만들어 넣고
		// 사용자로부터 입력받은 사번의 해당하는 이름과 연봉, 주소를 출력하시오
		// 사용자로부터 연봉을 입력받은후 해당되는 연봉보다 높은사람의 사번과 이름을 출력.
		// 2-1 ArrayList 에 비슷하게 employee 객체를 담아서 조회, 출력하는 것!
		// 2-2 Set에 비슷하게 employee 담아서 조회 , 출력하는것!
		
		Map<Integer , Employee> peopleMap = new HashMap<>();
		
		
		Employee people1 = new Employee();
		people1.setName("김동현");
		people1.setSalary(1500000);
		people1.setAddress("인천시 계양구 용종동");
		
		Employee people2 = new Employee();
		people2.setName("김윤아");
		people2.setSalary(3500000);
		people2.setAddress("서울특별시 강남구 대치동");
		
		Employee people3 = new Employee();
		people3.setName("김무열");
		people3.setSalary(8000000);
		people3.setAddress("부산시 몰라구 그래동");
		
		
//		peopleMap.put(1234, new Employee(("김동현"), 1500000, "인천시 계양구 용종동"));
//		peopleMap.put(2345, new Employee("김윤아", 3500000, "서울특별시 강남구 대치동"));
//		peopleMap.put(3456, new Employee("김무열", 8000000, "부산시 몰라구 그래동"));

		peopleMap.put(1234, people1);
		peopleMap.put(2345, people2);
		peopleMap.put(3456, people3);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾을 사람의 사번을 입력해주세요 : ");
		int findId = sc.nextInt();
		
		if(!peopleMap.containsKey(findId)) {
			System.out.println("해당사번번호가 없습니다.");
		}
		else {
			for(Integer num : peopleMap.keySet()) {
				if(num == findId)
					System.out.println(peopleMap.get(num).toString());
			}
		}
		
		System.out.print("연봉을 입력해주세요 : ");
		int yearPay = sc.nextInt();
		System.out.println(yearPay + " 보다 높은연보을 가진사람 ");
		for(Integer num : peopleMap.keySet()) {
			if(peopleMap.get(num).getSalary() > yearPay) {
				System.out.println("사번은 : " + num + "  " + peopleMap.get(num).toString());
			}
		}
		
		// 2-1 ArrayList 에 비슷하게 employee 객체를 담아서 조회, 출력하는 것!
		List<Employee2> EmployeeList = new ArrayList<>(); 
		Employee2 member1 = new Employee2();
		member1.setName("오수열");
		member1.setSalary(50000000);
		member1.setAddress("팬더아파트 4동 403호");
		member1.setId(3019);
		
		EmployeeList.add(member1);
		System.out.println(EmployeeList.get(0).toString());
		
		// 2-2 Set에 비슷하게 employee 담아서 조회 , 출력하는것!
		Set<Employee2> EmployeeSet = new HashSet<>();
		Employee2 member2 = new Employee2();
		member2.setName("석창희");
		member2.setSalary(40000000);
		member2.setAddress("인천시 계양구 계산동");
		member2.setId(4775);
		
		Employee2 member3 = new Employee2();
		member3.setName("이우현");
		member3.setSalary(60000000);
		member3.setAddress("인천시 계양구 서운동");
		member3.setId(4885);
		
		EmployeeSet.add(member2);
		EmployeeSet.add(member3);
		
		Iterator<Employee2> it3 = EmployeeSet.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next().toString());
		}
		
		
		
		
		
		System.out.print("찾을 사람의 사번을 입력해주세요 : ");
		findId = sc.nextInt();
		Set<Entry<Integer, Employee>> entrySet2 = peopleMap.entrySet();
		if(!peopleMap.containsKey(findId)) {
			System.out.println("해당사번번호가 없습니다.");
		}
		else {
			for(Entry<Integer, Employee> e : entrySet2) {
				if(findId == e.getKey()) {
					System.out.println(e.getValue().toString());
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<String> list = new ArrayList<>();
//		
//		System.out.println("연봉이 1500000원 인 사람");
//		for(String key : map.keySet()) {
//			if(map.get(key) == 1500000) {
//				System.out.println(key);
//				list.add(key);
//			}
//		}
//		
//		Collections.sort(list, Collections.reverseOrder());
//		System.out.println(list);
	}

}
