package BAEKJOON.Bronze.Bronze_IV.P10808번_알파벳_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();
    int alph[] = new int[26];
		String str = br.readLine();
		for(int i = 0; i < str.length(); i++){
      alph[(int)(str.charAt(i) - 'a')]++;
		}
    for(int i = 0; i < alph.length; i++) {
      sb.append(alph[i]).append(" ");
    }
    System.out.println(sb.toString());
	}
}