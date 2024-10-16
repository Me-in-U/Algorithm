package P30087번_진흥원_세미나;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      String semina = br.readLine();
      if (semina.equals("Algorithm")) {
        sb.append("204").append('\n');
      } else if (semina.equals("DataAnalysis")) {
        sb.append("207").append('\n');
      } else if (semina.equals("ArtificialIntelligence")) {
        sb.append("302").append('\n');
      } else if (semina.equals("CyberSecurity")) {
        sb.append("B101").append('\n');
      } else if (semina.equals("Network")) {
        sb.append("303").append('\n');
      } else if (semina.equals("Startup")) {
        sb.append("501").append('\n');
      } else {
        sb.append("105").append('\n');
      }
    }
    System.out.print(sb.toString());
  }
}
