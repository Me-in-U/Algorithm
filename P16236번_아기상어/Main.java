package P16236번_아기상어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  // 상, 좌, 우, 하
  static int[] dx = { -1, 0, 0, 1 };
  static int[] dy = { 0, -1, 1, 0 };
  // 변수
  static int N;
  static int shark_size;
  static int eatCount;
  static int result_time;
  static int search_time;
  static int[][] arr;
  static boolean[][] visited;
  static Queue<int[]> q;
  static Queue<int[]> re_q;
  static boolean isFound;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    // 입력 및 배열 생성
    N = Integer.parseInt(br.readLine());
    shark_size = 2;
    eatCount = 0;
    result_time = 0;
    search_time = 1;
    arr = new int[N][N];
    visited = new boolean[N][N];
    q = new LinkedList<>();
    isFound = false;
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
        if (arr[i][j] == 9) {
          q.offer(new int[] { i, j });
          arr[i][j] = 0;
        }
      }
    }
    // 계산
    // System.out.println("============");
    BFS(q);

    // 출력
    System.out.println(result_time);
  }

  public static void BFS(Queue<int[]> q) {
    // 최단거리 먹을 수 있는거 전부 검색
    Queue<int[]> temp = new LinkedList<>();
    re_q = new LinkedList<>();
    while (!q.isEmpty()) {
      int[] now = q.poll();
      visited[now[0]][now[1]] = true;
      // "상좌우하"로 탐색
      for (int k = 0; k < 4; k++) {
        int x = now[0] + dx[k];
        int y = now[1] + dy[k];
        // 해당 인덱스가 배열을 넘어가면 안됨
        if (x >= 0 && y >= 0 && x < N && y < N) {
          // 해당 값이 상어보다 작거나 같고 방문한적 없어야함
          if (arr[x][y] <= shark_size && !visited[x][y]) {
            // 지나감
            visited[x][y] = true;
            // 다음 칸 temp에 추가
            temp.add(new int[] { x, y });
            // System.out.println("검색:(" + x + ", " + y + ") - " + arr[x][y]);
            // 먹을 수 있는거 re_q에 추가
            if (arr[x][y] < shark_size && arr[x][y] != 0) {
              re_q.offer(new int[] { x, y });
              // System.out.println("re_q추가:(" + x + ", " + y + ")");
              isFound = true;
            }
          }
        }
      }
    }
    // temp가 있고, q가 없고, 못찾으면
    if (!temp.isEmpty() && q.isEmpty() && !isFound) {
      // System.out.println("==================");
      search_time++;
      BFS(temp);
    }
    // 하나라도 찾으면
    if (isFound) {
      qSort();
      // printarr();
      eatCount++;
      if (eatCount == shark_size) {
        shark_size++;
        eatCount = 0;
        // System.out.println("상어 크기 : " + shark_size + " - 상어 먹이 : " + eatCount + " / "
        // + shark_size);
      } else {
        // System.out.println("상어 크기 : " + shark_size + " - 상어 먹이 : " + eatCount + " / "
        // + shark_size);
      }

      result_time += search_time;
      // System.out.println("이동거리 :" + search_time + "-" + "총이동거리 :" + result_time);
      search_time = 1;

      // 최단 찾았으니깐 다시 시작
      // System.out.println("====다시검색====");
      visited = new boolean[N][N];
      isFound = false;
      // int[] now = re_q.peek();
      // System.out.println("재검색위치:(" + now[0] + ", " + now[1] + ") - 현위치");
      BFS(re_q);
    }
  }

  public static void qSort() {
    boolean[][] tempArr = new boolean[N][N];
    while (!re_q.isEmpty()) {
      int[] found = re_q.poll();
      tempArr[found[0]][found[1]] = true;
    }
    int[] reset = new int[2];
    boolean found = false;
    // 가장 위 우선, 가장 왼쪽 우선
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (!found && tempArr[i][j]) {
          reset[0] = i;
          reset[1] = j;
          re_q.offer(new int[] { i, j });
          found = true;
        }
      }
    }
    // System.out.println("먹음:(" + reset[0] + ", " + reset[1] + ") - " +
    // arr[reset[0]][reset[1]] + " 냠");
    arr[reset[0]][reset[1]] = 0;
  }

  public static void printarr() {
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}