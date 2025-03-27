package P19598번_최소_회의실_개수;

import java.io.IOException;
import java.util.PriorityQueue;

public class MainSwipe {
    private static class Time implements Comparable<Time> {
        int time;
        boolean isStart;

        public Time(int time, boolean isStart) {
            this.time = time;
            this.isStart = isStart;
        }

        @Override
        public int compareTo(Time o) {
            return this.time - o.time;
        }
    }

    public static void main(String[] args) throws IOException {
        PriorityQueue<Time> times = new PriorityQueue<>();
        int N = readInt();
        while (N-- > 0) {
            int start = readInt();
            int end = readInt();
            times.add(new Time(start, true));
            times.add(new Time(end, false));
        }
        int max = 0;
        int count = 0;
        int time = -1;
        while (!times.isEmpty()) {
            int nextTime = times.peek().moving;
            if (time == nextTime) {
                count += times.poll().isStart ? 1 : -1;
                max = Math.max(max, count);
            } else if (time < nextTime) {
                time = nextTime;
            }
        }
        System.out.print(new StringBuilder().append(max));
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
