package P11659번_구간_합_구하기_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = null;

    //첫 번째 줄 입력
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int arr [] = new int[N+1];
    arr[0] = 0;
    
    //구간합 배열 입력(키 포인트**)
    st = new StringTokenizer(br.readLine());
    for(int a = 1; a <= N; a++){
      arr[a] = arr[a-1] + Integer.parseInt(st.nextToken());
    }

    //M개 줄 구간합 출력
    for(int b = 0; b < M; b++){
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());
      sb.append(arr[j] - arr[i - 1]).append('\n');
    }
    bw.write(String.valueOf(sb));
    bw.flush();
  }
}