package P1269번_대칭_차집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = null;

      st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      
      HashSet<Integer> hashset = new HashSet<>();

      st = new StringTokenizer(br.readLine());
		for(int i = 0; i < A; i++){
         hashset.add(Integer.parseInt(st.nextToken()));
		}
      st = new StringTokenizer(br.readLine());
		for(int i = 0; i < B; i++){
         hashset.add(Integer.parseInt(st.nextToken()));
		}

      System.out.println((hashset.size() - A) + (hashset.size() - B));
	}
}