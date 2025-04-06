package BAEKJOON.Silver.Silver_II.P18870번_좌표_압축;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.HashMap;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
    int original[] = new int[N];
    int sorted[] = new int[N];
    HashMap<Integer, Integer> order = new HashMap<Integer, Integer>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++){
      original[i] = sorted[i] = Integer.parseInt(st.nextToken());
		}
    Arrays.sort(sorted);

    int order_num = 0;
    for(int key : sorted) {
			if(!order.containsKey(key)){
				order.put(key, order_num);
				order_num++;
      }
		}
    for(int key : original) {
			int output = order.get(key);
      sb.append(output).append(' ');
		}
    System.out.println(sb);
	}
}