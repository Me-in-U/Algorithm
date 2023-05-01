package P13241번_최소공배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    StringTokenizer st = new StringTokenizer(br.readLine());
    long B = Long.parseLong(st.nextToken());
    long A = Long.parseLong(st.nextToken());

    long A_temp = A;
    long B_temp = B;

		while(true){
      if(A == B){
        break;
      }
      else{
        if(A > B){
          B += B_temp;
        }
        else if(A < B){
          A += A_temp;
        }
      }
    }
    System.out.println(A);
	}
}