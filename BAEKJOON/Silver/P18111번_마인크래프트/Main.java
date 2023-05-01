package P18111번_마인크래프트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
  public static int arr[][];
  public static int backup[][];
  public static int build[][];
  public static int min_time = 2147483647;
  public static int level = -1;
  public static int N;
  public static int M;
  public static int B;
  public static int broken_blocks = 0;
  
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= null;

    //입력
    st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    B = Integer.parseInt(st.nextToken());
    
    arr = new int[N][M];
    backup = new int[N][M];
    build = new int[N][M];
    
		for(int i = 0; i < N; i++){
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j < M; j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
        backup[i][j] = arr[i][j];
        broken_blocks += arr[i][j];
      }
		}
    
    //가지고 있던 블럭에 다 부쉈을 때 블럭 더하기
    B += broken_blocks;

    for(int K = 0; K <= 256; K++){
      //높이가 0이면 다 부숴버릴때
      if(K == 0){
        int time = 0;
        time = broken_blocks * 2;
        if(time < min_time){
          min_time = time;
          level = K;
        }
      }
      //가진 블럭으로 목표 level K를 만들 수 있으면
      else if(B >= N * M * K){
        build(K);
      }
      //블럭이 부족하면
      else {
        //System.out.println("K = "+K+", 블럭 부족");
        continue;
      }
      
      //입력 배열 초기화
      for(int i = 0; i < N; i++) {
        for(int j = 0; j < M; j++) {
          arr[i][j] = backup[i][j];  
        }
      }
		}
    System.out.println(min_time + " " + level);
	}
  public static void build(int K){
    //평평한 목표 배열 생성
    for(int i[] : build){
      Arrays.fill(i, K);
    }
    int time = 0;
    while(true){
      for(int i = 0; i < N; i++){
        for(int j = 0; j < M; j++){
          //입력된 배열이 평평한 배열보다 높으면 깎기 time += 2*개수
          if(arr[i][j] > K){
            time += (2 * (arr[i][j] - K));
            arr[i][j] = K;
          }
          //입력된 배열이 평평한 배열보다 낮으면 샇기 time += 개수
          else if(arr[i][j] < K){
            time += (K - arr[i][j]);
            arr[i][j] = K;
          }
          //아님 랄로
          else
            continue;
        }
      }
      //입력배열이 평평해지면 최소시간이고 가장 높은지 확인후 break;
      if(Arrays.deepEquals(arr,build)){
        if(time <= min_time && level < K){
          min_time = time;
          level = K;
        }
        break;
      } 
    }
  }
}