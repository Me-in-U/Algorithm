package BAEKJOON.Silver.Silver_I.P2564번_경비원;

import java.io.IOException;

public class Main2 {
    public static class Position {
        // 1:북(왼쪽 경계로 부터 distance 만큼 떨어짐)
        // 2:남(왼쪽 경계로 부터 distance 만큼 떨어짐)
        // 3:서(위쪽 경계로 부터 distance 만큼 떨어짐)
        // 4:동(위쪽 경계로 부터 distance 만큼 떨어짐)
        int direction;
        int distance;

        Position(int direction, int distance) {
            this.direction = direction;
            this.distance = distance;
        }
    }

    private static int N;
    private static int M;

    public static void main(String[] args) throws IOException {
        M = readInt();
        N = readInt();

        int shopCount = readInt();
        Position[] shops = new Position[shopCount];
        for (int i = 0; i < shopCount; i++)
            shops[i] = new Position(readInt(), readInt());
        Position current = new Position(readInt(), readInt());

        int distanceSum = 0;
        for (Position shop : shops) {
            distanceSum += getDistance(current, shop);
        }
        System.out.println(distanceSum);
    }

    public static int getDistance(Position p1, Position p2) {
        Position t1 = new Position(p1.direction, p1.distance);
        Position t2 = new Position(p2.direction, p2.distance);
        // p1 position을 항상 작게
        if (t1.direction > t2.direction) {
            int temp = t1.direction;
            t1.direction = t2.direction;
            t2.direction = temp;

            temp = t1.distance;
            t1.distance = t2.distance;
            t2.distance = temp;
        }
        if (t1.direction == t2.direction)
            return Math.abs(t1.distance - t2.distance);
        if (t1.direction == 1 && t2.direction == 2) {
            // [ ]
            return Math.min((t1.distance + t2.distance + N),
                    ((M - t1.distance) + (M - t2.distance) + N));
        } else if (t1.direction == 3 && t2.direction == 4) {
            // ┌┐ └┘
            return Math.min((t1.distance + t2.distance + M),
                    ((N - t1.distance) + (N - t2.distance) + M));
        }
        // 북서
        if (t1.direction == 1 && t2.direction == 3) {
            return t1.distance + t2.distance;
        } // 남서
        else if (t1.direction == 2 && t2.direction == 3) {
            return t1.distance + (N - t2.distance);
        } // 남동
        else if (t1.direction == 2 && t2.direction == 4) {
            return (M - t1.distance) + (N - t2.distance);
        } // 북동
        else if (t1.direction == 1 && t2.direction == 4) {
            return (M - t1.distance) + t2.distance;
        }
        return -1;
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
