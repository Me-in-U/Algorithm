package P1620번_나는야_포켓몬_마스터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String,Integer> map = new HashMap<>();
    StringBuilder sb = new StringBuilder();

    //입력
		StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
    String arr[] = new String[N + 1];
		for(int i = 1; i <= N; i++){
      String name = br.readLine();
      map.put(name, i);
      arr[i] = name;
		}

    //검색 + 출력
    for(int i = 0; i < M; i++){
      String name = br.readLine();
      boolean isNumeric =  name.matches("[+-]?\\d*(\\.\\d+)?");
      if(!isNumeric) //이름(key)이면
        sb.append(map.get(name)).append('\n');
      else //숫자(value)면
        sb.append(arr[Integer.parseInt(name)]).append('\n');
    }
    System.out.println(sb);
	}
}