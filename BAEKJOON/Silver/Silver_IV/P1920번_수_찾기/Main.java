package BAEKJOON.Silver.Silver_IV.P1920번_수_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.HashSet;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    
    int N = Integer.parseInt(br.readLine());
    HashSet<Integer> N_HashSet = new HashSet<>();
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < N; i++){
      N_HashSet.add(Integer.parseInt(st.nextToken()));
    }
    
    int M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < M; i++){
      int find = Integer.parseInt(st.nextToken());
      if(N_HashSet.contains(find)){
        System.out.println("1");
      }
      else{
        System.out.println("0");
      }
    }
  }
}