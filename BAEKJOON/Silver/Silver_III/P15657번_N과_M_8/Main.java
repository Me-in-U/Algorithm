package BAEKJOON.Silver.Silver_III.P15657번_N과_M_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
  public static int N, M;
  public static int arr[], result[];
  public static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    
    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    
    st = new StringTokenizer(br.readLine());
    arr = new int[N];
    result = new int[M];
    for(int i = 0; i < N; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(arr);
    result(0,0);
    System.out.println(sb.toString());
  }
  public static void result(int start, int re){
    if(re == M){
      for(int i = 0; i < M; i++){
        sb.append(result[i]).append(" ");
      }
      sb.append('\n');
      return;
    }
    for(int i = start; i < N; i++){
      result[re] = arr[i];
      result(i, re + 1);
    }
  }
}