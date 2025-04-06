package BAEKJOON.Silver.Silver_IV.P1755번_숫자놀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    StringTokenizer st = new StringTokenizer(br.readLine());
    int M = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());
    String name[] = {"zero ", "one ", "two ",  "three ", "four ",
                     "five ", "six ", "seven ", "eight ", "nine "};
		ArrayList<String> list = new ArrayList<>();
    for(int i = M; i <= N; i++){
      String full_name = "";
      if(i < 10){
        full_name += name[i];
      }
      else if(i >= 10){
        full_name += name[i / 10];
        full_name += name[i % 10];
      }
      list.add(full_name);
	  }

    Collections.sort(list);

    StringBuilder sb = new StringBuilder(); 
    for(int i = 0; i < list.size(); i++){
      String to_num = list.get(i);
      for(int k = 0; k < 10; k++){
        to_num = to_num.replace(name[k], String.valueOf(k));
      }
      sb.append(to_num + " ");
      if(i % 10 == 9)
				sb.append('\n');
    }
    System.out.println(sb);
	}
}