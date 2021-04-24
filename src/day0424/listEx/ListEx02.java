package day0424.listEx;

public class ListEx02 {
	public static void main(String[] args) {
		String[] food = new String[5];
		food[0] = "자장면";
		food[1] = "짬뽕";
		food[2] = "볶음밥";
		food[3] = "탕수육";
		
		// 양장피를 index 1 번에 추가하고 배열을 출력하시오.
		
//		food[4] = food[3];
//		food[3] = food[2];
//		food[2] = food[1];
		
		for(int i = 4; i > 1; i--) {
			food[i] = food[i-1];
		}
		food[1] = "양장피"; // 마지막
		
		int count = 0;
		for(String str : food) {
			System.out.println(count + " : " + str);
			count++;
		}
		
		// 자장면 ,양장피 , 짬뽕, 볶음밥, 탕수육
		
		// 짬뽕을 삭제하고 배열을 출력하시오.
		System.out.println("----------------------");
		food[2] = food[3];
		food[3] = food[4];
		food[4] = null;
		
		count = 0;
		for(String str : food) {
			System.out.println(count + " : " + str);
			count++;
		}
		
		for(int i = 0 ; i < food.length-1; i++) {
			System.out.println(i + " : " + food[i] + " ");
		}
		
	}
}
