package BAEKJOON.Bronze.Bronze_IV.P5543번_상근날드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int min_ham = 2000;
    int min_bev = 2000;
		int N;
		for(int i = 0; i < 3; i++){
      N = Integer.parseInt(br.readLine());
      if(N < min_ham){
        min_ham = N;
      }
		}
    for(int i = 0; i < 2; i++){
      N = Integer.parseInt(br.readLine());
      if(N < min_bev){
        min_bev = N;
      }
		}
    System.out.println(min_ham + min_bev - 50);
	}
}