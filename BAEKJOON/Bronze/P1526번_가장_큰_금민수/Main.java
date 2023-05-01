package P1526번_금민수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    boolean found = false;
		int N = Integer.parseInt(br.readLine());
		while(found == false){
      String str = Integer.toString(N);
      for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == '7' || str.charAt(i) == '4'){
          if(i == str.length() - 1){
            System.out.println(N);
            found = true;
          }
          else{
            continue;
          }
        }
        else{
          N--;
          break;
        }
      }
		}
	}
}