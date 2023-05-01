package P10026번_적록;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

	static char[][] arr;
	static boolean[][] visited;

	static int N;
	static int count;
	static int count2;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		arr = new char[N][N];
		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = line.charAt(j);
			}
		}
		Queue<int[]> q = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					q.offer(new int[] { i, j });
					char prev_color = arr[i][j];
					BFS(q, prev_color);
					count++;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 'G') {
					arr[i][j] = 'R';
				}
			}
		}
		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					q.offer(new int[] { i, j });
					char prev_color = arr[i][j];
					BFS(q, prev_color);
					count2++;
				}
			}
		}
		System.out.println(count);
		System.out.println(count2);
	}

	public static void BFS(Queue<int[]> q, char color) {
		Queue<int[]> temp = new LinkedList<>();
		while (!q.isEmpty()) {
			int[] now = q.poll();
			visited[now[0]][now[1]] = true;

			// 상하좌우로 탐색
			for (int k = 0; k < 4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				// 해당 인덱스가 배열을 넘어가면 안됨
				if (x >= 0 && y >= 0 && x < N && y < N) {
					// 색이 처음 BFS값과 같아야하고 방문한적 없어야함
					if (arr[x][y] == color && !visited[x][y]) {
						visited[x][y] = true;
						temp.add(new int[] { x, y });
					}
				}
			}
		}
		if (!temp.isEmpty()) {
			BFS(temp, color);
		}
	}
}