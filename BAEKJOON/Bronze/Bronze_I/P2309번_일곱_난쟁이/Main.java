package BAEKJOON.Bronze.Bronze_I.P2309번_일곱_난쟁이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays; 

class Main {
  public static boolean printed = false;
  
  public static int result[] = new int[7];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    int arr[] = new int[9];
    boolean visited[] = new boolean[9];
		for(int i = 0; i < 9; i++){
      arr[i] = Integer.parseInt(br.readLine());
		}
    Arrays.sort(arr);

    combination(arr, visited, 0, 9, 7);
	}

  public static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
    if(printed){
      return;
    }
    if (r == 0) {
      int sum = 0;
      for (int i = 0; i < n; i++) {
        if (visited[i]) {
          sum += arr[i];
        }
      }
      if(sum == 100){
        for (int i = 0; i < n; i++) {
          if (visited[i]) {
            System.out.println(arr[i]);
          }
        }
        printed = true;
      }
      return;
    }

    for (int i = start; i < n; i++) {
        visited[i] = true;
        combination(arr, visited, i + 1, n, r - 1);
        visited[i] = false;
    }
  }
}

