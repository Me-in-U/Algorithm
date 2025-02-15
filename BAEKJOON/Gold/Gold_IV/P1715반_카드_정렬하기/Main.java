package P1715반_카드_정렬하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) throws IOException {
    // !입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> pq = new PriorityQueue<>(N);
    // !계산
    int result = 0;
    for (int i = 0; i < N; i++) {
      pq.add(Integer.parseInt(br.readLine()));
    }
    while (pq.size() != 1) {
      int sum = pq.remove() + pq.remove();
      pq.add(sum);
      result += sum;
    }
    // !출력
    System.out.println(result);
  }
}