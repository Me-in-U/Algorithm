package BAEKJOON.Bronze.Bronze_III.P10824번_네_수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    StringTokenizer st = new StringTokenizer(br.readLine());
    String ab = st.nextToken() + st.nextToken();
    String cd = st.nextToken() + st.nextToken();
    
    long result = Long.parseLong(ab) + Long.parseLong(cd);
    System.out.println(result);
	}
}