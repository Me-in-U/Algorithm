package P4740번_거울;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    while(true){
      String input = br.readLine();
      if(input.equals("***")){
        break;
      }
      StringBuilder sb = new StringBuilder();
      for(int i = input.length() - 1; i >= 0; i--){
        sb.append(input.charAt(i));
      }
      sb.append('\n');
      System.out.print(sb.toString());
    }
	}
}