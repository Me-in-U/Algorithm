package BAEKJOON.Bronze.Bronze_I.P30189번_경우의_수의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
 * 수학적 접근
 * 1. f(n, m, i)는 x+y = i를 만족하는 (x, y)의 개수입니다.
 * 2. x는 0부터 n까지, y는 0부터 m까지 가능합니다.
 * 3. x와 y의 가능한 조합은 (n + 1) * (m + 1)입니다.
 * 4. x + y의 최소값은 0, 최대값은 n + m입 니다.
 * 5. x + y = i를 만족하는 (x, y)의 개수는 f(n, m, i)입니다.
 * 
 * 이를 통해 다음과 같은 수식을 얻을 수 있습니다.
 * f(n,m,i)=(n+1)×(m+1)

 * 이 수식은 n과 m만 알면 바로 계산할 수 있으므로, 시간 복잡도는 O(1)입니다.
*/
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] ab = br.readLine().split(" ");
    System.out.println((Integer.parseInt(ab[0]) + 1) * (Integer.parseInt(ab[1]) + 1));
  }
}
/*
 * f(n, m, i)의 계산 방법
 * f(n, m, i)는 x + y = i를 만족하는 (x, y)의 개수입니다.
 * 여기서 x는 0 ≤ x ≤ n이고, y는 0 ≤ y ≤ n입니다.
 * 
 * 1. x가 0 ≤ x ≤ n, y = i - x입니다.
 * 2. y는 0 ≤ y ≤ n, 0 ≤ i - x ≤ m이어야 합니다.
 * 따라서 x는 i - m ≤ x ≤ i 범위에서 선택할수 있습니다.
 * 
 * 이를 통해 f(n, m, i)를 계산할 수 있습니다.
 * 
 * 수식으로 표현
 * f(n,m,i) = min(i 十 1, n 十 1) - max(O, i -m)
 */
// public class Main {
// public static void main(String[] args) throws IOException {
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// StringTokenizer st = new StringTokenizer(br.readLine());
// int n = Integer.parseInt(st.nextToken());
// int m = Integer.parseInt(st.nextToken());
// int count = 0;
// for (int i = 0; i <= n + m; i++)
// count += Math.min(i + 1, n + 1) - Math.max(0, i - m);
// System.out.println(count);
// }
// }

/*
 * 코드를 확인해보니, 문제를 해결하기 위해 브루트 포스 방식을 사용하셨습니다.
 * 이 방법은 문제를 해결할 수 있지만, 시간 복잡도가 높을 수 있습니다.
 * 특히 n과 m이 큰 경우에는 비효율적일 수 있습니다.
 * 
 * 그러나 문제의 제한 조건 1 ≤ n,m ≤ 100을 고려하면,
 * 이 방법도 충분히 문제를 해결할 수 있습니다.
 */
// public class Main {
// public static void main(String[] args) throws IOException {
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// StringTokenizer st = new StringTokenizer(br.readLine());
// int n = Integer.parseInt(st.nextToken());
// int m = Integer.parseInt(st.nextToken());
// List<boolean[][]> resultList = new ArrayList<>();
// for (int i = 0; i <= n + m; i++) {
// resultList.add(new boolean[n + 1][m + 1]);
// }
// for (int i = 0; i <= n; i++) {
// for (int j = 0; j <= m; j++) {
// resultList.get(i + j)[i][j] = true;
// }
// }
// int count = 0;
// for (boolean[][] bs : resultList) {
// for (int i = 0; i <= n; i++) {
// for (int j = 0; j <= m; j++) {
// if (bs[i][j]) {
// count++;
// }
// }
// }
// }
// System.out.println(count);
// }
// }