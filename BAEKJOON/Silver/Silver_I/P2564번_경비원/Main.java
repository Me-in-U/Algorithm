package P2564번_경비원;

import java.io.IOException;

public class Main {
    public static class Position {
        int direction;
        int distance;

        Position(int direction, int distance) {
            this.direction = direction;
            this.distance = distance;
        }
    }

    private static int N; // 세로 길이
    private static int M; // 가로 길이

    public static void main(String[] args) throws IOException {
        M = readInt();
        N = readInt();

        int shopCount = readInt();
        Position[] shops = new Position[shopCount];
        for (int i = 0; i < shopCount; i++)
            shops[i] = new Position(readInt(), readInt());
        Position current = new Position(readInt(), readInt());

        int perimeter = 2 * (M + N);
        int guardPos = getDist(current);

        int distanceSum = 0;
        for (Position shop : shops) {
            int shopPos = getDist(shop);
            int diff = Math.abs(guardPos - shopPos);
            int oppositeWayDist = perimeter - diff;
            distanceSum += Math.min(diff, oppositeWayDist);
        }
        System.out.println(distanceSum);
    }

    public static int getDist(Position pos) {
        int posValue = 0;
        if (pos.direction == 1) {
            posValue = pos.distance;
        } else if (pos.direction == 4) {
            posValue = M + pos.distance;
        } else if (pos.direction == 2) {
            posValue = M + N + (M - pos.distance);
        } else if (pos.direction == 3) {
            posValue = 2 * M + N + (N - pos.distance);
        }
        return posValue;
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
