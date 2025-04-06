package BAEKJOON.Silver.Silver_V.P1436번_영화감독_숌;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
		int num = 666;
		int count = 1;
    int N = Integer.parseInt(br.readLine());
        
		while(count != N) {
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		bw.write(String.valueOf(num));
    bw.newLine();
    bw.flush();
	}
}