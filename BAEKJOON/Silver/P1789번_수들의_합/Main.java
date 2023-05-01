package P1789번_수들의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long S = Long.parseLong(br.readLine());
    long sum = 0;
    int N = 0;
		for(int i = 1; ; i++){
      if(sum <= S){
        sum += i;
        N++;
      }
      else{
        System.out.println(N - 1);
        break;
      }
		}
	}
}