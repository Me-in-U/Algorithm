package SWEA.P순열기본;

/**
 * SWEA
 * 싸피 13기 부울경 4반 - 순열 (1)
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-19
 */
import java.io.IOException;
import java.util.Arrays;

public class Solution {
    private static int[] data;
    private static int[] result;
    private static int N;
    private static int R;
    private static StringBuilder sb = new StringBuilder();
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        // T번 반복(테스트 케이스 수)
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            sb.append('#').append(t).append('\n');
            // 변수 입력 및 초기화
            N = readInt();
            R = readInt();
            data = new int[N];
            visited = new boolean[N];
            result = new int[R];
            for (int i = 0; i < N; i++)
                data[i] = readInt();
            // 정렬하여 아래 조건 만족
            // 첫번째 뽑은 숫자를 작은 것부터 출력한다.
            // 만일 첫번째 뽑은 숫자가 같다면 두번째 뽑은 숫자가 작은 것부터 출력한다
            Arrays.sort(data);
            // dfs
            dfs(0);
        }
        System.out.print(sb.toString());
    }

    /**
     * (depth == R) 일 때, result[]의 숫자 출력
     * 
     * @param depth 선택된 카드 수
     */
    public static void dfs(int depth) {
        if (depth == R) {
            for (int i = 0; i < R; i++)
                sb.append(result[i]).append(' ');
            sb.append('\n');
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                result[depth] = data[i];
                visited[i] = true;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }

    public static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
