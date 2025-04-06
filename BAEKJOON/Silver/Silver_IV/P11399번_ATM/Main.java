package BAEKJOON.Silver.Silver_IV.P11399번_ATM;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int N = Integer.parseInt(br.readLine());
    int P[] = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i< N; i++){
      P[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(P);

    int sum = 0;
    for(int i = 0, k = N; i<N; i++, k--) {
      sum += P[i]*k;
    }
    bw.write(String.valueOf(sum));
    bw.newLine();
    bw.flush();
  }
}