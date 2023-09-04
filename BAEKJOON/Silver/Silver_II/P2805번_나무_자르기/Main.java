package P2805번_나무_자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
      
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int arr[] = new int[N];
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < N; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(arr);

    long start = 0;
    long end = arr[arr.length - 1];
    long mid = 0;
    long result = 0;

    while(start <= end){
      long sum = 0;
      mid = (start + end) / 2;

      for(int i = 0; i < arr.length; i++){
        if(arr[i] > mid){
          sum += arr[i] - mid;
        }
      }
      if(sum >= M){
        if(mid > result){
          result = mid;
        }
        start = mid + 1;
      }
      else{
        end = mid - 1;
      }
    }
    System.out.println(result);
  }
}