package P14865번_곡선_자르기;

import java.io.IOException;

public class Main {
    private static class Point implements Comparable<Point> {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x)
                return this.y - o.y;
            return this.x - o.x;
        }
    }

    public static void main(String[] args) throws IOException {
        int N = readInt();
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            points[i] = new Point(readInt(), readInt());
        }

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
