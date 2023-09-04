package P10820번_문자열_분석;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = null;

    while((str = br.readLine()) != null){
      int output[] = new int[4];

      for(int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if(c >= 'a' && c <= 'z'){
          output[0]++;
        }
        else if(c >= 'A' && c <= 'Z'){
          output[1]++;
        }
        else if(c >= '0' && c <= '9'){
          output[2]++;
        }
        else if(c == ' '){
          output[3]++;
        }
      }
      System.out.println(output[0] + " " + output[1] + " " + output[2] + " " + output[3]);
    }
	}
}