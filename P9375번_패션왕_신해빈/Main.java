package P9375번_패션왕_신해빈;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    for(int i = 0; i < N; i++){
      Map<String, Integer> map = new HashMap<>();
      st = new StringTokenizer(br.readLine());
      int T = Integer.parseInt(st.nextToken());
      for(int j = 0; j < T; j++){
        st = new StringTokenizer(br.readLine());
        String clothes = st.nextToken();
        String category = st.nextToken();
        if (map.containsKey(category)) {
        		map.put(category, map.get(category) + 1);
        	} 
        else {
          map.put(category, 1);
        }
      }
      int result = 1;
      for (int val : map.values()) {
				result *= (val + 1);
			}
      sb.append(result - 1).append('\n');
    }
    bw.write(String.valueOf(sb));
    bw.flush();
  }
}