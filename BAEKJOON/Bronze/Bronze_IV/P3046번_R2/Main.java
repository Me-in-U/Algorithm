package BAEKJOON.Bronze.Bronze_IV.P3046번_R2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int R1 = Integer.parseInt(st.nextToken());
    int S = Integer.parseInt(st.nextToken());
    
		System.out.println((2 * S) - R1);
	}
}