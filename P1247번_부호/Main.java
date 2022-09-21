package P1247번_부호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    BigInteger zero = new BigInteger("0");
    StringBuilder sb = new StringBuilder();

		for(int i = 0; i < 3; i++){
      BigInteger sum = new BigInteger("0");
      int N = Integer.parseInt(br.readLine());
      for(int j = 0; j < N; j++){
        sum = sum.add(new BigInteger(br.readLine()));
      }
      if(sum.compareTo(zero) == 1){
        sb.append("+").append('\n');
      }
      else if(sum.equals(zero)){
        sb.append("0").append('\n');
      }
      else if(sum.compareTo(zero) == -1){
        sb.append("-").append('\n');
      }
		}
    System.out.println(sb.toString());
	}
}