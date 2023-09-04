package P1654번_랜선_자르기;

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
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int K = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());
    int arr[] = new int[K];
    for(int i = 0; i< K; i++){
      arr[i] = Integer.parseInt(br.readLine());
    }
    
    Arrays.sort(arr);

    long min = 1;
    long max = arr[K-1];
    long mid = 0;

    while(min <= max){
      long N_count = 0;
      mid = (min + max) / 2;
      for(int i = 0; i < arr.length; i++){
        N_count += arr[i] / mid;
      }
      //System.out.println("min = "+min+", mid = "+mid+", max = "+max);      
      //필요개수보다 많으면 길이 늘리기
      if(N_count >= N){
        min = mid + 1;
      }
      //필요개수보다 적으면 길이 줄이기
      else if(N_count < N){
        max = mid - 1;
      }
    }
    bw.write(String.valueOf(max));
    bw.newLine();
    bw.flush();
  }
}