package BAEKJOON.Silver.Silver_V.P7785번_회사에_있는_사람;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Collections;
import java.util.HashMap;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
      StringBuilder sb = new StringBuilder();

      LinkedList<String> list = new LinkedList<>();
      HashMap<String,String> map = new HashMap<>();

		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++){
         st = new StringTokenizer(br.readLine());
         String name = st.nextToken();
         String exist = st.nextToken();

         map.put(name, exist);
		}
      for(String str: map.keySet())
      if(map.get(str).equals("enter"))
         list.add(str);

      Collections.sort(list, Collections.reverseOrder());

      for(String str:list)
			sb.append(str).append("\n");

      System.out.println(sb.toString());
	}
}