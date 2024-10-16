package P2166번_다각형의_면적;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Point {
    long x;
    long y;

    Point(long x, long y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            long x = Long.parseLong(line[0]);
            long y = Long.parseLong(line[1]);
            points[i] = new Point(x, y);
        }
        double area = 0.0;
        for (int i = 0; i < N; i++) {
            int j = (i + 1) % N;
            area += points[i].x * points[j].y - points[i].y * points[j].x;
        }
        area = Math.abs(area) / 2.0;
        System.out.printf("%.1f", area);
    }
}
