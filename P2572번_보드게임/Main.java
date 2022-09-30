package P2572번_보드게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    int T, N, M, K;
    int dp[][] = new int[1002][502];
    List<Node>[] roads = new ArrayList[502];

    char[] route;
		int from;
		int to;
		char r;

    N = Integer.parseInt(br.readLine());
		route = (" " + br.readLine().replaceAll(" ", "")).toCharArray();
    st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

    for(int i = 1; i <= M; i++){
			roads[i] = new ArrayList<Node>();
		}
    for(int i = 0; i < K; i++){
      st = new StringTokenizer(br.readLine());
			from = Integer.parseInt(st.nextToken());
			to = Integer.parseInt(st.nextToken());
			r = st.nextToken().charAt(0);

			roads[from].add(new Node(from, to, r));
			roads[to].add(new Node(to, from, r));
		}
	}
  public static class Node{
    int from;
    int to;
    char road;
  
    public Node(int f, int t, char r){
      this.from = f;
      this.to = t;
      this.road = r;
    }
  
    @Override
    public String toString() {
      return from + "->" + to + ":" + road;
    }
  }
}
