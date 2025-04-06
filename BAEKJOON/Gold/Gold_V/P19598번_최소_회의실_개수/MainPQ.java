package BAEKJOON.Gold.Gold_V.P19598번_최소_회의실_개수;

import java.io.IOException;
import java.util.PriorityQueue;

public class MainPQ {
    private static class Time implements Comparable<Time> {
        int start;
        int end;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Time o) {
            if (this.start == o.start) {
                return this.end - o.end;
            }
            return this.start - o.start;
        }
    }

    public static void main(String[] args) throws IOException {
        int N = readInt();
        PriorityQueue<Time> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int start = readInt();
            int end = readInt();
            pq.add(new Time(start, end));
        }
        PriorityQueue<Integer> rooms = new PriorityQueue<>();
        rooms.add(-1);
        while (!pq.isEmpty()) {
            Time time = pq.poll();
            if (rooms.peek() <= time.start) {
                rooms.poll();
            }
            rooms.add(time.end);
        }
        System.out.print(new StringBuilder().append(rooms.size()));
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
