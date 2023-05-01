package P1929번_소수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
    //코드입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    String input = br.readLine();
    StringTokenizer st = null;
    st = new StringTokenizer(input, " ");
    int M = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());
    
		boolean prime[] = new boolean[N+1];
		prime[0] = true;
		prime[1] = true;
        
		for(int i = 2; i <= N; i++){
			if(prime[i] == false){
				if(i >= M)
          sb.append(i).append('\n');
        //에라토스테네스의 체 => i배수 제거
				for(int j = i+i; j <= N; j+=i)
					prime[j] = true;
      }
		}
    bw.write(String.valueOf(sb));
    bw.flush();
  }
}
