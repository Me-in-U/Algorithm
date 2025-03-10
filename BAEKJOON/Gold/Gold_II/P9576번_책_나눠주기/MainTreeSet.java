package P9576번_책_나눠주기;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        while (T-- > 0) {
            int N = readInt(); // 책 수
            int M = readInt(); // 학생 수
            int[][] requests = new int[M][]; // 요청 범위 [a,b]
            for (int i = 0; i < M; i++) {
                requests[i] = new int[] { readInt(), readInt() };
            }
            // b(끝 번호) 기준 오름차 정렬
            Arrays.sort(requests, new Comparator<int[]>() {
                public int compare(int[] o1, int[] o2) {
                    return o1[1] - o2[1];
                }
            });
            // 1~N까지 책
            TreeSet<Integer> availableBooks = new TreeSet<>();
            for (int i = 1; i <= N; i++) {
                availableBooks.add(i);
            }
            int result = 0;
            for (int i = 0; i < M; i++) {
                int a = requests[i][0];
                int b = requests[i][1];
                // availableBooks.ceiling(a)를 이용해 a 이상인 가장 작은 책 번호를 찾음
                Integer book = availableBooks.ceiling(a);
                // 찾은 책이 null이 아니고, 학생이 원하는 범위(b 이하)라면 할당 가능
                if (book != null && book <= b) {
                    availableBooks.remove(book);// 할당했으므로 TreeSet에서 제거
                    result++;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
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
