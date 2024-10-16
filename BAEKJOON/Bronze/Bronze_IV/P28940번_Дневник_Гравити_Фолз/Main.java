package P28940번_Дневник_Гравити_Фолз;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    st = new StringTokenizer(br.readLine());
    int w = Integer.parseInt(st.nextToken());
    int h = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    if (w < a || h < b) {
      System.out.println("-1");
      return;
    }
    int lettersPerPage = (w / a) * (h / b);
    int totalPages = (int) Math.ceil((double) n / lettersPerPage);
    System.out.println(totalPages);
  }
}
