package P1260번_DFS와_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.LinkedList;

class Main {
  public static boolean connection[][];
  public static boolean checked[];
  public static int N;
  public static int M;
  public static int V;
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    

    connection = new boolean[1001][1001];
    checked = new boolean[1001];
    //입력
    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    V = Integer.parseInt(st.nextToken());

    for(int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      connection[x][y] = connection[y][x] = true;
    }

    //dfs 계산
    dfs(V);

    //초기화
    checked = new boolean[1001];
    System.out.println();

    //bfs 계산
    bfs();
	}
  public static void dfs(int i){
    checked[i] = true;
    System.out.print(i + " ");

    for(int j = 1; j <= N; j++){
      if(connection[i][j] == true && checked[j] == false){
        dfs(j);
      }
    }
  }
  public static void bfs(){
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(V);
    checked[V] = true;
    System.out.print(V + " ");

    while(!queue.isEmpty()){
      int temp = queue.poll();

      for(int j = 1; j <= N; j++){
        if(connection[temp][j] == true && checked[j] == false){
          queue.offer(j);
          checked[j] = true;
          System.out.print(j + " ");
        }
      }
    }
  }
}