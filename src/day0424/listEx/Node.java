package day0424.listEx;

// LinkedList에서 사용하는 노드는 이런 형태와 비슷하다.
public class Node<T> {
	private T data;
	private Node next;
	
	
	public Node(T data) {
		this.data = data;
		next = null;
	}
	
	public Node(T data , Node next) {
		this.data = data;
		this.next = next;
	}
}
