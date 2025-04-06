package BAEKJOON.Silver.Silver_IV.P28279번_덱_2;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Deque<Integer> q = new ArrayDeque<>();
        int N = readInt();
        while (N-- > 0) {
            switch (readInt()) {
                case 1:
                    q.addFirst(readInt());
                    break;
                case 2:
                    q.addLast(readInt());
                    break;
                case 3:
                    if (q.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(q.pollFirst()).append('\n');
                    }
                    break;
                case 4:
                    if (q.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(q.pollLast()).append('\n');
                    }
                    break;
                case 5:
                    sb.append(q.size()).append('\n');
                    break;
                case 6:
                    sb.append(q.isEmpty() ? 1 : 0).append('\n');
                    break;
                case 7:
                    if (q.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(q.peekFirst()).append('\n');
                    }
                    break;
                case 8:
                    if (q.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(q.peekLast()).append('\n');
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.print(sb.toString());
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