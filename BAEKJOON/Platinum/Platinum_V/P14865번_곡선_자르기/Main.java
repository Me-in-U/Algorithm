package P14865번_곡선_자르기;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static class CrossPoint implements Comparable<CrossPoint> {
        int x;
        boolean isOpener;

        public CrossPoint(int x, boolean isOpener) {
            this.x = x;
            this.isOpener = isOpener;
        }

        @Override
        public int compareTo(CrossPoint o) {
            return this.x - o.x;
        }
    }

    public static void main(String[] args) throws IOException {
        int N = readInt();
        Position[] positions = new Position[N];
        int minLeft = Integer.MAX_VALUE;
        int minDown = Integer.MAX_VALUE;
        int startIndex = 0;
        // 입력과 동시에 시작 인덱스 결정 (x, y 모두 최솟값인 점)
        for (int i = 0; i < N; i++) {
            int x = readInt();
            int y = readInt();
            positions[i] = new Position(x, y);
            if (x <= minLeft && y <= minDown) {
                minLeft = x;
                minDown = y;
                startIndex = i;
            }
        }

        // x와 수직이고 두 끝점의 부호가 다른 선분 찾기
        List<CrossPoint> crossPoints = new ArrayList<>();
        boolean isFirstCrossFound = false;
        int firstFoundXPoint = 0;
        int currIndex = startIndex; // 처음 인덱스
        do {
            int nextIndex = (currIndex + 1) % N; // 다음 인덱스
            Position p1 = positions[currIndex];
            Position p2 = positions[nextIndex];
            // 현재 x == 선분에서 y값의 부호가 바뀌는지 확인
            if ((0 < p1.y && p2.y < 0) || (0 < p2.y && p1.y < 0)) {
                if (!isFirstCrossFound) {
                    firstFoundXPoint = p1.x;
                } else {
                    // 처음 찾은 x 좌표와 두번째로 찾은 x 좌표 비교
                    // 왼쪽에서 열리는 봉우리
                    int openXPoint = Math.min(firstFoundXPoint, p1.x);
                    crossPoints.add(new CrossPoint(openXPoint, true));
                    // 오른쪽에서 닫히는 봉우리
                    int closeXPoint = Math.max(firstFoundXPoint, p1.x);
                    crossPoints.add(new CrossPoint(closeXPoint, false));
                }
                isFirstCrossFound = !isFirstCrossFound;
            }
            currIndex = nextIndex;
        } while (currIndex != startIndex);

        // x값으로 오름차 정렬
        Collections.sort(crossPoints);

        // 덮히지 않은 봉우리
        int outerShellCount = 0;
        // 뭔가 포함하지 않는 봉우리
        int notIncludesCount = 0;
        int depth = 0;
        for (int i = 0; i < crossPoints.size(); i++) {
            // 시작하는 봉우리
            if (crossPoints.get(i).isOpener) {
                // 처음 시작하는 봉우리면 덮히지 않은 봉우리이다.
                if (depth == 0) {
                    outerShellCount++;
                }
                depth++;
                // 시작하자마자 바로 끝나면 뭔가 포함하지 않는 봉우리
                // 항상 쌍으로 존재해서 사이즈 체크 필요없음
                if (!crossPoints.get(i + 1).isOpener) {
                    notIncludesCount++;
                }
            } // 봉우리 끝
            else {
                depth--;
            }
        }
        System.out.println(new StringBuilder().append(outerShellCount).append(" ").append(notIncludesCount));
    }

    private static int readInt() throws IOException {
        int n = 0;
        int c = System.in.read();
        boolean isNegative = false;
        while (c <= 32) {
            c = System.in.read();
        }
        if (c == '-') {
            isNegative = true;
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c - '0');
            c = System.in.read();
        }
        return isNegative ? -n : n;
    }
}
