package BAEKJOON.Silver.Silver_V.P11723번_집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.Arrays;
import java.util.HashSet;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    StringTokenizer st = null;
    HashSet<Integer> hashset = new HashSet<>();
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++){
      st = new StringTokenizer(br.readLine());
      String order = st.nextToken();
      if(order.equals("add")){
        hashset.add(Integer.parseInt(st.nextToken()));
      }
      else if(order.equals("remove")){
        hashset.remove(Integer.parseInt(st.nextToken()));
      }
      else if(order.equals("check")){
        if(hashset.contains(Integer.parseInt(st.nextToken())))
          sb.append("1").append('\n');
        else
          sb.append("0").append('\n');        
      }
      else if(order.equals("toggle")){
        int a = Integer.parseInt(st.nextToken());
        if(hashset.contains(a))
          hashset.remove(a);
        else
          hashset.add(a);
      }
      else if(order.equals("all")){
        hashset = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
      }
      else if(order.equals("empty")){
        hashset.clear();
      }
		}
    System.out.println(sb);
	}
}