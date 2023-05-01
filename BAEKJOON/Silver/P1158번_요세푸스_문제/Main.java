package P1158번_요세푸스_문제;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;

import java.util.Queue;
import java.util.LinkedList;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Queue <Integer> que = new LinkedList<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    sb.append('<');
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    
    for(int i = 1; i <= N; i++){
      que.add(i);
    }
    
    while(que.size()!=1){
      for(int i = 0; i < K-1; i++){
        que.add(que.poll());
      }
      sb.append(que.poll()).append(',').append(' ');
    }
    
    sb.append(que.poll()).append('>');
    bw.write(String.valueOf(sb));
    bw.flush();
  }
}
