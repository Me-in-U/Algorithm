package SWEA.P4008번_숫자_만들기;

/**
 * SW Expert Academy
 * 4008번 숫자 만들기 ?
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-25
 * JAVA8 : 메모리 27,568 KB, 시간 104ms
 */
import java.io.IOException;

public class Solution_4008_숫자만들기_김민규 {
    private static int max;
    private static int min;
    private static int N;
    private static int plus;
    private static int minus;
    private static int multiply;
    private static int divide;;
    private static int[] numbers;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 입력 및 초기화
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            N = readInt();
            plus = readInt();
            minus = readInt();
            multiply = readInt();
            divide = readInt();
            numbers = new int[N];
            for (int i = 0; i < N; i++) {
                numbers[i] = readInt();
            }

            // dfs로 모든 경우 탐색
            dfs(1, plus, minus, multiply, divide, numbers[0]);

            // 출력
            sb.append("#").append(t).append(" ").append(Math.abs(max - min)).append("\n");
        }
        System.out.print(sb.toString());
    }

    /**
     * @param index    연산자에 계산할 숫자 index
     * @param plus     덧셈 연산자 수
     * @param minus    뺄셈 연산자 수
     * @param multiply 곱셈 연산자 수
     * @param divide   나눗셈 연산자 수
     * @param result   현재까지의 연산결과
     */
    private static void dfs(int index, int plus, int minus, int multiply, int divide, int result) {
        if (index == N) {
            max = Math.max(max, result);
            min = Math.min(min, result);
            return;
        }
        if (0 < plus)
            dfs(index + 1, plus - 1, minus, multiply, divide, result + numbers[index]);
        if (0 < minus)
            dfs(index + 1, plus, minus - 1, multiply, divide, result - numbers[index]);
        if (0 < multiply)
            dfs(index + 1, plus, minus, multiply - 1, divide, result * numbers[index]);
        if (0 < divide)
            dfs(index + 1, plus, minus, multiply, divide - 1, result / numbers[index]);
    }

    // 빠른 양의 정수 입력
    // 쓸데없는 문자 제거 버전
    private static int readInt() throws IOException {
        int c;
        while ((c = System.in.read()) != -1 && (c < '0' || c > '9'))
            ;
        int n = c & 15;
        while ((c = System.in.read()) >= '0' && c <= '9')
            n = n * 10 + (c - '0');
        return n;
    }
}
