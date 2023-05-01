package P11279번_최대_힙;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue; 
import java.util.Collections;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    int N = Integer.parseInt(br.readLine());
    for(int i = 0; i< N; i++){
      int x = Integer.parseInt(br.readLine());
      if(x == 0 && pq.isEmpty() == true){
        bw.write(String.valueOf(0));
        bw.newLine();
      }
      else if(x == 0 && pq.isEmpty() == false){
        bw.write(String.valueOf(pq.poll()));
        bw.newLine();
      }
      else
        pq.add(x);
    }
    bw.flush();
  }
}