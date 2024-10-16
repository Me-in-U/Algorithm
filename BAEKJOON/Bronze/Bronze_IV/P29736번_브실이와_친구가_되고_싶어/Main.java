package P29736번_브실이와_친구가_되고_싶어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    // !어쩌구저쩌구 초기화
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    // !입력
    st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int K = Integer.parseInt(st.nextToken());
    int X = Integer.parseInt(st.nextToken());

    // ! 계산
    int count = 0;
    for (int i = K - X; i <= K + X; i++)
      if (A <= i && i <= B)
        count++;

    // ! 출력
    System.out.println(count == 0 ? "IMPOSSIBLE" : count);
  }
}