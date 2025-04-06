package BAEKJOON.Silver.Silver_II.P23757번_아이들과_선물_상자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.PriorityQueue; 
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    //선언
    boolean happy = true;
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
    
    //입력
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < N; i++){
      priorityQueue.add(Integer.parseInt(st.nextToken()));
		}
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < M; i++){
      int want_presents = Integer.parseInt(st.nextToken());
      int max_present = priorityQueue.poll();
      if(want_presents > max_present){
        happy = false;
        break;
      }
      else{
        priorityQueue.add(max_present - want_presents);
      }
    }
    //출력
    if(happy)
      System.out.println("1");    
    else
      System.out.println("0");    
	}
}