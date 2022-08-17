package P2309번_일곱_난쟁이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays; 

class Main {
  public static int result[] = new int[7];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    int arr[] = new int[9];
    int newcomb[] = new int[7];
		for(int i = 0; i < 9; i++){
      arr[i] = Integer.parseInt(br.readLine());
		}
    Arrays.sort(arr);

    Combination(arr, 0, 9, 7, 2, newcomb);
	}

  //nCk (index = 0 부터 k개, t는 남은 데이터)
  public static void Combination(int[] arr, int index, int n, int k, int t, int[] newcomb) {
    int sum = 0;
    for(int i = 0; i < newcomb.length; i++){
      sum += newcomb[i];
    }
    if(k == 0 && sum == 100) {
      for(int j = 0; j < newcomb.length; j++){
          System.out.print(newcomb[j] + " " + '\n');
      }
      return;
    } 
    if(t == n)
      return;
    
    newcomb[index] = arr[t];
    Combination(arr,index+1, n, k-1,t+1, newcomb);	//선택했을 때
    Combination(arr,index,   n, k,  t+1, newcomb);	//선택 안했을 때
  }
}

