package main;

import java.util.Scanner;
import java.util.Stack;

public class DFS활용_Flood_fill {
	// 입력
//	5
//	0 0 0 0 0
//	0 0 0 1 1
//	0 0 0 1 0
//	1 1 1 1 0
//	0 0 0 0 0
//	1 1 		3 
//	시작위치 1,1  컬럼값
	
	// 출력
//	3 3 3 3 3
//	3 3 3 1 1
//	3 3 3 1 0
//	1 1 1 1 0
//	0 0 0 0 0
	
	static final int MAX_N = 10;
	static int[][] D = {{-1,0} , {1,0}, {0,-1} , {0 ,1}};
	
	// 상하좌후로 가기위해 방향을 정한다
	// 대각선도 가능하다 {-1, 1 } , { -1, -1} , { 1 ,1 } , { 1 , -1} 
	// 이렇게 8방향으로 움직이게 할수도 있다. 
	
	static int N;
	static int[][] Board = new int[MAX_N][MAX_N];
	static class Point{
		int row;
		int col;
		Point(int r , int c) {
			row = r;
			col = c;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i = 0 ; i < N; i++) {
			for(int j = 0 ; j < N; j++) {
				Board[i][j] = sc.nextInt();
			}
		}
		
		int sRow = sc.nextInt();
		int sCol = sc.nextInt();
		int color = sc.nextInt();
		
		dfs(sRow, sCol, color);
		for(int i = 0 ; i < N; i++) {
			for(int j = 0 ; j < N; j++) {
				System.out.print(Board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void dfs(int r, int c , int color ) {
		boolean[][] visited = new boolean[MAX_N][MAX_N];
		Stack<Point>mystack = new Stack<>();
		mystack.push(new Point(r, c));
		
		while(!mystack.isEmpty()) {
			Point curr = mystack.pop();
			if(visited[curr.row][curr.col]) continue;
			
			visited[curr.row][curr.col] = true;
			Board[curr.row][curr.col]= color;
			
			for(int i = 0 ; i < 4; i++) {
				int nr = curr.row+ D[i][0], nc = curr.col+D[i][1];
				if( nr<0 || nr > N -1 || nc < 0 || nc > N-1 ) continue;
				// 배열의 허용 범위를 넘어가면 끝내기
				if(visited[nr][nc]) continue;
				// 만약에 방문햇던곳을 또 방문하면 끝내기
				if(Board[nr][nc] == 1) continue;
				// 배열의 원소가 1 이면 즉 벽이 있으면 탐색 끝내기
				mystack.push(new Point(nr, nc));
				// 위의 조건을 다 만족하지 않아서 새로운 탐색을 하게되면 다시 스택에 넣는다.
			}
			
		}

		
	}
}
