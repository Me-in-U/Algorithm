package P1764번_듣보잡;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    HashSet<String> hs = new HashSet<>(N);
    HashSet<String> result = new HashSet<>();
    
    //듣도 못한 사람
    for(int i = 0; i< N; i++){
      String name = br.readLine();    
      hs.add(name);
    }
    //듣도 못한 사람 중 보도 못한 사람 포함 여부
    for(int i = 0; i< M; i++){
      String name = br.readLine();    
      if(hs.contains(name)){
        result.add(name);
      }
    }

    //정렬
    ArrayList<String> arr = new ArrayList<>(result);
    Collections.sort(arr);
    
    //출력
    System.out.println(result.size());
    StringBuilder sb = new StringBuilder();
    for (String s : arr){
      sb.append(s).append('\n');
    }
    System.out.println(sb);
  }
}
