package P3020번_개똥벌레;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int H = Integer.parseInt(st.nextToken());

		Map<Integer,Integer> tm = new HashMap<>();
        
    for(int i = 1; i<=N; i++) {
      st =new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      
      if(i%2==0) {
        for(int j = x; j <= H; j++	) {
          if(tm.containsKey(j))
            tm.replace(j, tm.get(j)+1);
          else
            tm.put(j,1);
        }
      }
      else {
        for(int j = 1; j<= x; j++	) {
          if(tm.containsKey(j))
            tm.replace(j, tm.get(j)+1);
          else
            tm.put(j,1);
        }
      }
    }
    
    int min = 98765432;
    int count = 0;
    for(Integer key : tm.keySet()) {
      if(min>=tm.get(key)){
        min = tm.get(key);
        count++;
      }
    }
    System.out.print(min + " " + count);
  }
}