package P2667번_단지번호붙이기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue; 
import java.util.Queue;
import java.util.LinkedList;

public class Main {
  static PriorityQueue<Integer> priorityQueue;
  static Queue<int[]> Queue;

  static int[] dx = {0, 1, 0, -1};
  static int[] dy = {1, 0, -1, 0};
  
  static int[][] arr;
  static boolean[][] visited;

  static int N;
  
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    priorityQueue = new PriorityQueue<>();
    Queue = new LinkedList<>();

    N = Integer.parseInt(br.readLine());
    arr = new int[N][N];
    visited = new boolean[N][N];
    for(int i = 0; i < N; i++) {
      String line = br.readLine();
      for(int j = 0; j < N; j++) {
        int a = Integer.parseInt(line.substring(j, j + 1));
        arr[i][j] = a;
        if(a == 0){
          visited[i][j] = true;
        }
      }
    }

    for(int i = 0; i < N; i++){
      for(int j = 0; j < N; j++) {
        if(!visited[i][j]){
          Queue.offer(new int[] {i, j});
          BFS(Queue);
        }
      }
    }
    System.out.println(priorityQueue.size());
    while(!priorityQueue.isEmpty()){
      System.out.println(priorityQueue.poll());
    }
	}
  public static void BFS(Queue<int[]> q){
    int[] now;
    int count = 1;

    while(!q.isEmpty()){
      now = q.poll();
      visited[now[0]][now[1]] = true;
      //상하좌우로 탐색
      for(int k = 0; k < 4; k++){
        int x = now[0] + dx[k];
        int y = now[1] + dy[k];
        //해당 인덱스가 배열을 넘어가면 안됨
        if(x >= 0 && y >= 0 && x < N && y < N){
          //해당 인덱스가 0이아니고 방문한적 없어야함
          if(arr[x][y] == 1 && !visited[x][y]){
            visited[x][y] = true;
            count++;
            q.add(new int[] {x, y});
          }
        }
      }
    }
    priorityQueue.add(count);
  }
}