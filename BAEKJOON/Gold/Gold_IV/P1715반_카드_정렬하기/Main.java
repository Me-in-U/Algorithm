package P1715반_카드_정렬하기;

import java.io.IOException;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        // !입력
        int N = readInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(N);
        // !계산
        int result = 0;
        while (N-- > 0)
            pq.add(readInt());
        while (pq.size() > 1) {
            int sum = pq.poll() + pq.poll();
            pq.add(sum);
            result += sum;
        }
        // !출력
        System.out.print(new StringBuilder().append(result));
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