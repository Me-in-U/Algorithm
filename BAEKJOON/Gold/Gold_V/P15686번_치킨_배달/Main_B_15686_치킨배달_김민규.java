package P15686번_치킨_배달;

/**
 * BAEKJOON ONLINE JUDGE 15686번 치킨 배달 골드 V
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-27 JAVA8 : 메모리 16,456 KB, 시간 240ms
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_B_15686_치킨배달_김민규 {
    public static int N;
    public static int M;
    public static int[] toVisit;
    public static int minDistance = Integer.MAX_VALUE;
    public static ArrayList<int[]> homes;
    public static ArrayList<int[]> stores;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        toVisit = new int[M];
        homes = new ArrayList<int[]>();
        stores = new ArrayList<int[]>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int information = Integer.parseInt(st.nextToken());
                if (information == 1) { // !집
                    homes.add(new int[] { i, j });
                } else if (information == 2) {// !치킨집
                    stores.add(new int[] { i, j });
                }
            }
        }
        visited = new boolean[stores.size()];
        dfs(0, 0);
        System.out.println(minDistance);
    }

    /**
     * dfs를 이용한 backtracking
     * 
     * @param start dfs를 시작할 index
     * @param depth dfs depth
     */
    public static void dfs(int start, int depth) {
        if (depth == M) {
            int distance = 0;
            for (int i = 0; i < homes.size(); i++) {
                int tempDistance = Integer.MAX_VALUE;
                for (int j : toVisit) {
                    tempDistance = Math.min(tempDistance, getDistance(homes.get(i), stores.get(j)));
                }
                distance += tempDistance;
            }
            minDistance = Math.min(distance, minDistance);
            return;
        }
        for (int i = start; i < stores.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                toVisit[depth] = i;
                dfs(i, depth + 1);
                visited[i] = false;
            }
        }
    }

    /**
     * 장소 a 와 b 사이의 거리를 구하는 메소드
     * 
     * @param a 장소 a[] {x, y}
     * @param b 장소 b[] {x, y}
     * @return int: 거리값
     */
    public static int getDistance(int[] a, int[] b) {
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
    }
}
