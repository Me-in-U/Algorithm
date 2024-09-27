package BAEKJOON.Gold.Gold_II.P17387번_선분_교차_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static class Point {
        long x;
        long y;

        Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    private static long ccw(Point pi, Point pj, Point pk) {
        return (pk.x - pi.x) * (pj.y - pi.y) - (pk.y - pi.y) * (pj.x - pi.x);
    }

    private static boolean onLine(Point pi, Point pj, Point pk) {
        if (Math.min(pi.x, pj.x) <= pk.x && pk.x <= Math.max(pi.x, pj.x)
                && Math.min(pi.y, pj.y) <= pk.y && pk.y <= Math.max(pi.y, pj.y)) {
            return true;
        }
        return false;
    }

    private static int isIntersect(Point p1, Point p2, Point p3, Point p4) {
        long d1 = ccw(p3, p4, p1);
        long d2 = ccw(p3, p4, p2);
        long d3 = ccw(p1, p2, p3);
        long d4 = ccw(p1, p2, p4);

        if (((d1 > 0 && d2 < 0) || (d1 < 0 && d2 > 0)) && ((d3 > 0 && d4 < 0) || (d3 < 0 && d4 > 0))) {
            return 1;
        } else if (d1 == 0 && onLine(p3, p4, p1) || d2 == 0 && onLine(p3, p4, p2) ||
                d3 == 0 && onLine(p1, p2, p3) || d4 == 0 && onLine(p1, p2, p4)) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Point p1 = new Point(Long.parseLong(input[0]), Long.parseLong(input[1]));
        Point p2 = new Point(Long.parseLong(input[2]), Long.parseLong(input[3]));
        input = br.readLine().split(" ");
        Point p3 = new Point(Long.parseLong(input[0]), Long.parseLong(input[1]));
        Point p4 = new Point(Long.parseLong(input[2]), Long.parseLong(input[3]));
        System.out.println(isIntersect(p1, p2, p3, p4));
    }
}
