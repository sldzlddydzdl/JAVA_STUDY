package main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Queue {
//	BFS ( Breadth First Search )
//	- 그래프 순회 방법 중 하나
//		- 너비 운선 탐색
//		
//	- 시작 노드에서 인접 노드를 모두 방문하고,
//	방문한 노드에서 인접 노드를 모두 방문하는 
//	것을 반복하게 된다.
	
//			0
//		   / \
//		  /   \
//		 1     2
//		/ \   /
//	   3    4
//	   
//	   입력
//	   5 6
//	   0 1  0 2  1 3  1 4  2 4  3 4
	
//	   출력
//	   0 1 2 3 4
	
	static final int MAX_N = 10; // 문제에 따라 정의하면됨
	static int N, E;
	static int[][] Graph = new int[MAX_N][MAX_N];
	
	static void bfs(int node) {
		boolean[] visited = new boolean[MAX_N];
		
		Queue<Integer> myqueue = new LinkedList<>();
		visited[node] = true;
		myqueue.add(node);
		
		while(!myqueue.isEmpty()) {
			int curr = myqueue.remove();
			
			System.out.print(curr + " ");
			
			for(int next = 0 ; next < N; next++) {
				if(!visited[next] && Graph[curr][next] != 0) {
					visited[next] = true;
					myqueue.add(next);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		E = sc.nextInt();
		for(int  i = 0; i < E; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			Graph[u][v] = Graph[v][u] = 1;
		}
		bfs(0);
	}
}
