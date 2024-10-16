package P17219번_비밀번호_찾기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.HashMap;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    HashMap<String, String> map = new HashMap<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      map.put(st.nextToken(), st.nextToken());
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < M; i++)
      sb.append(map.get(br.readLine())).append("\n");

    bw.write(sb.toString());
    bw.flush();
  }
}