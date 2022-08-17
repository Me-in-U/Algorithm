package P10039번_평균_점수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    int sum = 0;
    for(int i=0; i< 5; i++) {
      int input = Integer.parseInt(br.readLine());
      if(input < 40)
        sum += 40;
      else
        sum += input;
    }
    System.out.println(sum / 5);
	}
}