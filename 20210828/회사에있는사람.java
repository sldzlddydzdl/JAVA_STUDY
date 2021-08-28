package main;

import java.util.*;

public class 회사에있는사람 {

	public static void main(String[] args)  {
		// 백준 7785번 문제 
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// 입력을위한 2차배열 생성
		String[][] name_inout = new String[n][2];
		
		for(int i= 0 ; i < name_inout.length; i++) {
			name_inout[i][0] = sc.next();
			name_inout[i][1] = sc.next();
		}
		
		// 맵에 들어온사람과 그사람이 몇번 입력됬는지 센다.
		Map<String, Integer> member = new HashMap<>();
		// 나간사람 명단 리스트를 하나 판다.
 		List<String> removelist = new ArrayList<>(); 
		
 		// 이름이 몇번 대입됬는지 센다 왜냐하면 한번들어온 사람이 다시들어올수 없으므로 그사람이 두번대입되면 나간거로 친다.
		for(String[] key : name_inout ) {
			member.put(key[0], member.getOrDefault(key[0], 0 ) + 1);
		}
		
		// member에서 모든키에대한 포문을 돈다.
		for(String k : member.keySet()) {
			
			// 만약 한사람의 이름이 2번이상 입력됫으면서 동시에 짝수번 들어왔으면 들어왔다 나간것이므로
			// 나간사람 명단에 추가한다.
			if(member.get(k) >= 2 && member.get(k) % 2 ==0 ) {
				removelist.add(k);
//				member.remove(k); -> 에러 생긴다. 왜냐면 조건에 만족하고 지우고 다시 포문돌면 null이 걸려서 에러가 난다
//									 ConcurrentModifyException
//				
//				따라서 list 를 하나 파서 조건에 만족하는걸 리스트에 담고 
//				따로 list값들ㅇ르 불러서 맵에서 지워야 한다. 
//				그래야 ConcurrentModifyException을 막을수 있따.
//				for(String k : removelist)
//					member.remove(k);
				
			}
		}
		
		// 나간사람의 명단의 이름을 member 맵에서도 제거해준다.
		for(String k : removelist)
			member.remove(k);
		
		// 현재남아있는 멤버들을 사전역순으로 출력하기위해 새로운 배열을 하나판다.
		String[] getmember = new String[member.size()];
		
		// member에 남아있는사람을 getmember에 옮긴다.
		int j = 0;
		for(String k : member.keySet()) {
			 getmember[j] = k;
			j++;
		}
		
		// 남아있는 사람들이름을 역순으로 정렬한다.
		Arrays.sort(getmember , Collections.reverseOrder());
		
		// 정답 출력
		for(String k : getmember)
			System.out.println(k);
		
	}
}	