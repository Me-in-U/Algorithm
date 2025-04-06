package BAEKJOON.Bronze.Bronze_II.P5622번_다이얼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    int sum = 0;
    int num[] = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		String input = br.readLine();
		for(int i = 0; i < input.length(); i++){
      sum += num[(int)(input.charAt(i) -'A')];
		}
    System.out.println(sum);
	}
}