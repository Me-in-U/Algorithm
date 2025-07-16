package BAEKJOON.Gold.Gold_IV.P1477번_휴게소_세우기;

// [수정] readInt() 메서드 추가 후 사용
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt(); // 기존 휴게소의 개수
        int M = readInt(); // 새로 설치할 휴게소의 개수
        int L = readInt(); // 고속도로의 길이
        // 기존 휴게소 위치 + 경계(0, L) 포함한 배열 생성
        int[] stops = new int[N + 2];
        stops[0] = 0;
        stops[N + 1] = L;

        for (int i = 1; i <= N; i++) {
            stops[i] = readInt();
        }

        // 이분 탐색
        Arrays.sort(stops);
        int left = 1;
        int right = L;
        int answer = L;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (canPlace(stops, M, mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(answer);
    }

    private static boolean canPlace(int[] stops, int M, int D) {
        int needed = 0;
        for (int i = 1; i < stops.length; i++) {
            int gap = stops[i] - stops[i - 1];
            needed += (gap + D - 1) / D - 1;
            if (needed > M)
                return false;
        }
        return needed <= M;
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = n * 10 + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
