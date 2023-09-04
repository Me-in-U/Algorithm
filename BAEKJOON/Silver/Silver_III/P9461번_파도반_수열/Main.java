package P9461번_파도반_수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    ArrayList<Long> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();

    list.add((long)0); //index 0
    list.add((long)1); //index 1
    list.add((long)1); //index 2

    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      int N = Integer.parseInt(br.readLine());
      try {
        long result = list.get(N);
        sb.append(result).append('\n');
      } catch (IndexOutOfBoundsException e) {
        int index = list.size();
        while(true){
          list.add(list.get(index - 3) + list.get(index - 2));
          if(index == N){
            sb.append(list.get(N)).append('\n');
            break;
          }
          index++;
        }
      }
    }
    System.out.println(sb.toString());
    //System.out.println(list.toString());
	}
}