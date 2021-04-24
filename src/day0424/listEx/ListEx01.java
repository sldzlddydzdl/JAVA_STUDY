package day0424.listEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	ArrayList와 Linkedlist 사용방법은 같다.
		 * 
		 * 	add, get 다른 클래스에대한 고민을 따로
		 * 	할 필요가 없다.
		 * 
		 */
		
		// ArrayList
		// 배열과 같음.
		// LinkedList
		// 노드와 링크
		
		ArrayList<String> arrayList = new ArrayList<>();
		LinkedList<String> linkedList = new LinkedList<>();
		
		// 취미를 리스트에 추가
		arrayList.add("게임");
		linkedList.add("게임");
		
		arrayList.add("운동");
		linkedList.add("운동");
		
		arrayList.add("독서");
		linkedList.add("독서");
		
		System.out.println("ArrayList : " + arrayList);
		System.out.println("linkedList : " + linkedList);
		
		// index 2번째 값은?
		System.out.println("ArrayList 의 index 2 : " + arrayList.get(2));
		System.out.println("linkedList 의 index 2 : " + linkedList.get(2));
		
		// arrayList와 linkedList 의 차이
		// 사용 목적이 다르다.
		
		
//		arraylist 는 배열이라하고
//		linkedlist 는 노드라한다.
		
		// 조회할때 arraylist가 더 좋다.
		// 조회가 아닌상황을 썼을때 linkedlist가 더 좋다?
		// linkedlist 는 추가/삭제 많이할때 빠르다. 쓰인다.
		
		// arraylist -> 배열을 이용하기 때문에 조회에 빠르다.
		// linkedlist -> 노드와 주소를 이용해서 추가/삭제에 빠르다.
		
		
		
		
		
		
		
	}

}
