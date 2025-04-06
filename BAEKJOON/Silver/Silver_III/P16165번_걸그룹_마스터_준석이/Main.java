package BAEKJOON.Silver.Silver_III.P16165번_걸그룹_마스터_준석이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    //맴버이름(key), 팀이름(value)
    HashMap<String,String> map = new HashMap<>();
    //입력
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    for(int i = 0; i < N; i++){
      String team = br.readLine();
      int member_count = Integer.parseInt(br.readLine());
      for(int k = 0; k < member_count; k++){
        map.put(br.readLine(), team);
      }
    }
    //출력
    for(int i = 0; i < M; i++){
      String find = br.readLine();
      int out = Integer.parseInt(br.readLine());
      //팀이름 받고 맴버이름 출력
      if(out == 0){
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        for(Map.Entry<String, String> entry : map.entrySet()) {
          if(entry.getValue().equals(find)) {
            priorityQueue.add(entry.getKey());
          }
        }
        while(!priorityQueue.isEmpty()){
          sb.append(priorityQueue.poll()).append('\n');
        }
      }
      //맴버이름 받고 팀이름 출력
      else if(out == 1){
        for(Map.Entry<String, String> entry : map.entrySet()) {
          if(entry.getKey().equals(find)) {
            sb.append(entry.getValue()).append('\n');
          }
        }
      }
    }
    System.out.print(sb.toString());
	}
}