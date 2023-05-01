import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    StringTokenizer st = null;
    
    int max = 0;
    int train = 0;
	for(int i = 0; i < 4; i++){
      st = new StringTokenizer(br.readLine());
      int exit = Integer.parseInt(st.nextToken());
      int ride = Integer.parseInt(st.nextToken());
      train += (ride - exit);
      if(train > max){
        max = train;
      }
	}
	System.out.println(max);
  }
}