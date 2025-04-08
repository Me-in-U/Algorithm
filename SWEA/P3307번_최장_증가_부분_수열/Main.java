package SWEA.P3307번_최장_증가_부분_수열;

/**
 * <h1>SW Expert Academy 3307번 최장 증가 부분 수열</h1>
 * <p>
 * JAVA 8 : 메모리 26,496 KB, 시간 88ms <br>
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-04-08
 */
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = (int) readLong();
        for (int t = 1; t <= T; t++) {
            // 수열 입력
            int N = (int) readLong();
            long[] seq = new long[N];
            for (int i = 0; i < N; i++)
                seq[i] = readLong();
            // LIS 배열 초기화
            long[] LIS = new long[N + 1];
            LIS[0] = Long.MIN_VALUE; // -INF 값(초기 가장 큰 값)
            int len = 0;
            for (int i = 0; i < N; i++) {
                long key = seq[i];
                // LIS의 마지막 값보다 크면 LIS에 추가
                if (LIS[len] < key) {
                    LIS[++len] = key;
                } else { // LIS의 마지막 값보다 작거나 같으면 이진 탐색으로 삽입 위치 찾기
                    int index = Arrays.binarySearch(LIS, 0, len + 1, key);
                    // index가 양수면 key가 존재하는 위치, 음수면 key가 삽입될 위치
                    // 음수일 경우 -(index + 1)로 변환하여 삽입 위치를 찾음
                    if (index < 0) {
                        index = -(index + 1);
                    }
                    // LIS[index]에 key 업데이트
                    LIS[index] = key;
                }
            }
            sb.append("#").append(t).append(" ").append(len).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static long readLong() throws IOException {
        int c;
        long n = 0;
        c = System.in.read();
        while (c <= ' ') {
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}