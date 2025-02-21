package P2798번_블랙잭;

/**
 * BAEKJOON ONLINE JUDGE
 * 2798번 블랙잭 BRONZE II
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-21
 * JAVA8 : 메모리 11420 KB, 시간 68ms
 * JAVA11 : 메모리 14024 KB, 시간 104ms
 */

import java.io.IOException;

public class Main_2798_블랙잭_김민규 {
    private static int[] nums;
    private static int N;
    private static int M;

    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        N = readInt();
        M = readInt();
        nums = new int[N];
        for (int i = 0; i < N; i++)
            nums[i] = readInt();

        // 브루트포스
        int max = bruteForce();

        // 출력
        System.out.println(max);
    }

    /**
     * brute force로 서로 다른 3개의 수를 더해서
     * 
     * @return M과 가장 가가운 수를 만드는 경우를 찾아서 return
     */
    private static int bruteForce() {
        int maxSum = 0;
        for (int i = 0; i < (N - 2); i++) {
            for (int j = (i + 1); j < (N - 1); j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (M == sum)
                        return sum;
                    if (maxSum < sum && sum <= M) {
                        maxSum = sum;
                    }
                }
            }
        }
        return maxSum;
    }

    private static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}