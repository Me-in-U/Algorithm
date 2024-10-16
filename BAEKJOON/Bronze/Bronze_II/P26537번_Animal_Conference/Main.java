package P26537번_Animal_Conference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static class Distance implements Comparable<Distance> {
        Point p1;
        Point p2;
        long distanceBetweenPoints;

        Distance(Point p1, Point p2) {
            this.p1 = p1;
            this.p2 = p2;
            this.distanceBetweenPoints = (long) (p1.x - p2.x) * (p1.x - p2.x) + (long) (p1.y - p2.y) * (p1.y - p2.y);
        }

        @Override
        public int compareTo(Distance d) {
            if (this.distanceBetweenPoints == d.distanceBetweenPoints) {
                if (this.p1.x == d.p1.x) {
                    if (this.p1.y == d.p1.y) {
                        if (this.p2.x == d.p2.x) {
                            return this.p2.y - d.p2.y;
                        }
                        return this.p2.x - d.p2.x;
                    }
                    return this.p1.y - d.p1.y;
                }
                return this.p1.x - d.p1.x;
            }
            return Long.compare(this.distanceBetweenPoints, d.distanceBetweenPoints);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (p1.x == p2.x) {
                if (p1.y <= p2.y) {
                    sb.append(p1.x).append(" ").append(p1.y).append(" ").append(p2.x).append(" ").append(p2.y);
                } else {
                    sb.append(p2.x).append(" ").append(p2.y).append(" ").append(p1.x).append(" ").append(p1.y);
                }
            } else {
                if (p1.x < p2.x) {
                    sb.append(p1.x).append(" ").append(p1.y).append(" ").append(p2.x).append(" ").append(p2.y);
                } else {
                    sb.append(p2.x).append(" ").append(p2.y).append(" ").append(p1.x).append(" ").append(p1.y);
                }
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            List<Point> points = new ArrayList<>();
            List<Distance> distances = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                Point temp = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
                for (Point point : points) {
                    distances.add(new Distance(point, temp));
                }
                points.add(temp);
            }
            Collections.sort(distances);
            sb.append(distances.get(0).toString()).append('\n');
        }
        System.out.print(sb.toString());
    }
}
