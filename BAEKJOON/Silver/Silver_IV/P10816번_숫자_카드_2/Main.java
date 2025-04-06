package BAEKJOON.Silver.Silver_IV.P10816번_숫자_카드_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = null;
    
    int N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0; i < N; i++){
      int key = Integer.parseInt(st.nextToken());
      if(map.containsKey(key))
        map.put(key, (map.get(key) + 1));
      else
        map.put(key, 1);
    }

    int M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < M; i++){
      int key = Integer.parseInt(st.nextToken());
      if(map.containsKey(key))
        sb.append(map.get(key)+" ");
      else
        sb.append("0 ");
    }
    
    System.out.println(sb);
  }
}