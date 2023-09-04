package P11724번_연결_요소의_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {    
    static int N, M, cnt;
    static boolean visits[];
    static boolean map[][];
 
    public static void main(String[] args) throws IOException { 
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = null;

      st = new StringTokenizer(br.readLine());
      N = Integer.parseInt(st.nextToken());
      M = Integer.parseInt(st.nextToken());

      visits = new boolean[N + 1];
      map = new boolean[N + 1][N + 1];
      cnt = 0;

      for (int i = 1; i <= M; i++) {
        st = new StringTokenizer(br.readLine());
        int tmp1 = Integer.parseInt(st.nextToken());
        int tmp2 = Integer.parseInt(st.nextToken());
        
        map[tmp1][tmp2] = true;
        map[tmp2][tmp1] = true;        
      }
      
      for(int i = 1; i <= N; i++) {
        if (!visits[i]) {
          dfs(i);
          cnt++;
        }
      }
      
      System.out.println(cnt);        
    }
    
    private static void dfs(int start) {
      visits[start] = true;
      
      for(int i = 1; i <= N; i++) {
        if (map[start][i] && !visits[i]) {
          dfs(i);
        }
      }
  }
}