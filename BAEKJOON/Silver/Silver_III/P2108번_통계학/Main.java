package BAEKJOON.Silver.Silver_III.P2108번_통계학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int sum = 0;
		int[] max_arr = new int[8001]; // 최빈값 배열 -4000 ~ 4000
		int max = -4000, min = 4000;
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			max_arr[arr[i] + 4000]++;
      
			if(N == 1) {
				max = 0;
				min = 0;
			}
      else {
				if(max < arr[i]) {
					max = arr[i];
				}
				if(min > arr[i]) {
					min = arr[i];
				}
			}			
		}
		
		Arrays.sort(arr);
		
		// 최빈값
		int max_cnt = 0;
		int result = 0;
		for(int i = 0; i < max_arr.length; i++) {
			if(max_cnt < max_arr[i]) {
				max_cnt = max_arr[i];
				result = i - 4000;
			}
		}
		int cnt = 0;
		for(int i = 0; i < max_arr.length; i++) {
			if(max_cnt == max_arr[i]) { // 최빈값이 중복일 경우
				result = i - 4000;
				if(cnt == 1) {
					break;
				}
				cnt++;
			}
		}
    StringBuilder sb = new StringBuilder();
    sb.append((int)Math.round((double)sum/N)).append('\n').append(arr[N/2]).append('\n').append(result).append('\n').append(max - min).append('\n');
    bw.write(String.valueOf(sb));
    bw.flush();
	}
}