package Gold_I.P1933번_스카이라인;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static class Rectangle {
        int x;
        int height;

        Rectangle(int x, int h) {
            this.x = x;
            this.height = h;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        // x기준 오름차순 -> height 기준 내림차순
        PriorityQueue<Rectangle> pq = new PriorityQueue<>(
                (o1, o2) -> (o1.x == o2.x) ? (o2.height - o1.height) : (o1.x - o2.x));
        // height 기준 내림차순
        TreeMap<Integer, Integer> tm = new TreeMap<>((o1, o2) -> (o2 - o1));
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int left_x = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            int right_x = Integer.parseInt(st.nextToken());
            pq.add(new Rectangle(left_x, height));
            pq.add(new Rectangle(right_x, -height));
        }
        int maxX = -1;
        int maxH = -1;
        tm.put(0, 1);
        while (!pq.isEmpty()) {
            Rectangle rectangle = pq.poll();
            if (rectangle.height > 0) {// 양수인 경우 == 건물이 생길때 == 왼쪽 x값
                tm.put(rectangle.height, tm.getOrDefault(rectangle.height, 0) + 1);
            } else { // 음수인 경우 == 건물이 없어질때 == 오른쪽 x값
                // TreeMap에서 현재 높이의 건물 수 1 감소
                int value = tm.get(-rectangle.height);
                if (value == 1) {
                    tm.remove(-rectangle.height);
                } else {
                    tm.replace(-rectangle.height, value - 1);
                }
            }
            int height = tm.firstKey(); // 현재 가장 큰 height 값 정보
            // maxX값과 maxH값이 바뀌었다면 업데이트
            if (maxX != rectangle.x && maxH != height) {
                maxX = rectangle.x;
                maxH = height;
                sb.append(maxX).append(' ').append(maxH).append(' ');
            }
        }
        System.out.print(sb.toString().trim());
    }
}