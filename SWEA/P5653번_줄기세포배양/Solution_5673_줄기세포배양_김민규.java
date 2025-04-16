package SWEA.P5653번_줄기세포배양;

/**
 * <h1>SW Expert Academy 5653번 줄기세포배양</h1>
 * <p>
 * JAVA 8 : 메모리 40,188KB, 시간 139ms <br>
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-04-16
 */
import java.io.FileInputStream;
import java.io.IOException;

public class Solution_5673_줄기세포배양_김민규 {
    private static final int[] dx = { 1, -1, 0, 0 };
    private static final int[] dy = { 0, 0, -1, 1 };
    private static boolean[][] map;// 셀의 존재 여부
    private static Cell[] cell;
    private static int N, M, K, count;

    private static class Cell {
        int x, y, life; // 비활성 + 활성 기간
        Cell next; // 같은 생명력에 속하는 Cell 연결

        Cell(int x, int y, int life, Cell next) {
            this.x = x;
            this.y = y;
            this.life = life << 1;
            this.next = next;
        }
    }

    public static void main(String[] args) throws IOException {
        // 파일 입력 경로 (필요 시 수정)
        System.setIn(new FileInputStream(
                "C:\\Users\\SSAFY\\Documents\\GitHub\\Algorithm\\SWEA\\P5653번_줄기세포배양\\sample_input.txt"));
        StringBuilder sb = new StringBuilder();
        int T = readInt(); // 테스트 케이스 수
        for (int t = 1; t <= T; t++) {
            count = 0;
            cell = new Cell[11];
            N = readInt();
            M = readInt();
            K = readInt();
            map = new boolean[N + (K << 1)][M + (K << 1)];
            for (int x = K; x < N + K; x++) {
                for (int y = K; y < M + K; y++) {
                    int life = readInt();
                    if (life == 0)
                        continue;
                    map[x][y] = true;
                    cell[life] = new Cell(x, y, life, cell[life]);
                    count++;
                }
            }
            // 분열 시작
            while (K-- > 0) {
                for (int life = 10; life >= 1; life--) {
                    // 큰 life 부터 시작해서 작은 life 분열 무시
                    for (Cell cur = cell[life]; cur != null; cur = cur.next) {
                        // 죽은 셀 무시(이후는 생명력 0인 셀만 남음)
                        if (cur.life == 0) {
                            break;
                        }
                        // 생명력 감소
                        cur.life--;
                        // 활성화 되고 1시간 지났을 때만 분열
                        if (cur.life == life - 1) {
                            for (int d = 0; d < 4; d++) {
                                int nx = cur.x + dx[d];
                                int ny = cur.y + dy[d];
                                // 이미 해당 칸에 셀이 있으면 분열하지 않음
                                if (map[nx][ny])
                                    continue;
                                map[nx][ny] = true;
                                // 새로운 셀의 생명력은 현재 셀의 초기 생명력를 그대로 사용
                                cell[life] = new Cell(nx, ny, life, cell[life]);
                                count++;
                            }
                        }
                        // 만약 남은 life가 0이면 셀이 죽은 것으로 간주하여 전체 셀 수 감소
                        if (cur.life == 0) {
                            count--;
                        }
                    }
                }
            }
            sb.append("#").append(t).append(" ").append(count).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
