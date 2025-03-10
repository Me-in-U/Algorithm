package P17470번_배열_돌리기_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  protected static boolean rotation = false;
  protected static int point = 0;
  protected static int N;
  protected static int M;
  protected static int R;
  protected static int[] position = { 0, 1 };
  protected static int[][][] arr = new int[4][][];
  protected static final int[] upDown = { 3, 2, 1, 0 };
  protected static final int[] leftRight = { 1, 0, 3, 2 };
  protected static final int[] rotateRight = { 1, 2, 3, 0 };
  protected static final int[] rotateLeft = { 3, 0, 1, 2 };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    // !선언
    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    R = Integer.parseInt(st.nextToken());
    arr[0] = new int[N / 2][M / 2];
    arr[1] = new int[N / 2][M / 2];
    arr[2] = new int[N / 2][M / 2];
    arr[3] = new int[N / 2][M / 2];
    // !입력
    for (int i = 0; i < N / 2; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M / 2; j++) {
        arr[0][i][j] = Integer.parseInt(st.nextToken());
      }
      for (int j = 0; j < M / 2; j++) {
        arr[1][i][j] = Integer.parseInt(st.nextToken());
      }
    }
    for (int i = 0; i < N / 2; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M / 2; j++) {
        arr[3][i][j] = Integer.parseInt(st.nextToken());
      }
      for (int j = 0; j < M / 2; j++) {
        arr[2][i][j] = Integer.parseInt(st.nextToken());
      }
    }
    // !계산
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < R; i++) {
      calc(Integer.parseInt(st.nextToken()));
    }
    // !출력
    print();
  }

  public static void calc(int num) {
    if (num == 1) {
      point = upDown[point];
      position[0] = upDown[position[0]];
      position[1] = upDown[position[1]];
    } else if (num == 2) {
      point = leftRight[point];
      position[0] = leftRight[position[0]];
      position[1] = leftRight[position[1]];
    } else if (num == 3) {
      point = rotateRight[point];
      position[0] = rotateRight[position[0]];
      position[1] = rotateRight[position[1]];
      rotation = !rotation;
    } else if (num == 4) {
      point = rotateLeft[point];
      position[0] = rotateLeft[position[0]];
      position[1] = rotateLeft[position[1]];
      rotation = !rotation;
    } else if (num == 5) {
      position[0] = rotateRight[position[0]];
      position[1] = rotateRight[position[1]];
    } else if (num == 6) {
      position[0] = rotateLeft[position[0]];
      position[1] = rotateLeft[position[1]];
    }
  }

  public static void print() {
    int[][] printOrder = { { 0, 1, 3, 2 }, { 0, 3, 1, 2 }, { 1, 0, 2, 3 }, { 3, 0, 2, 1 }, { 2, 1, 3, 0 },
        { 2, 3, 1, 0 }, { 1, 2, 0, 3 }, { 3, 2, 0, 1 } };
    if (position[0] == 0) {
      if (position[1] == 1) {
        printArray(printOrder[0]);
      } else if (position[1] == 3) {
        printArray(printOrder[1]);
      }
    } else if (position[0] == 1) {
      if (position[1] == 0) {
        printArray(printOrder[2]);
      } else if (position[1] == 2) {
        printArray(printOrder[3]);
      }
    } else if (position[0] == 2) {
      if (position[1] == 1) {
        printArray(printOrder[4]);
      } else if (position[1] == 3) {
        printArray(printOrder[5]);
      }
    } else if (position[0] == 3) {
      if (position[1] == 0) {
        printArray(printOrder[6]);
      } else if (position[1] == 2) {
        printArray(printOrder[7]);
      }
    }
  }

  public static void printArray(int[] order) {
    StringBuilder sb = new StringBuilder();
    if (rotation) {
      if (point == 0) {
        for (int j = 0; j < M / 2; j++) {
          for (int k = 0; k < N / 2; k++) {
            sb.append(arr[order[0]][k][j]).append(' ');
          }
          for (int k = 0; k < N / 2; k++) {
            sb.append(arr[order[1]][k][j]).append(' ');
          }
          sb.append('\n');
        }
        for (int j = 0; j < M / 2; j++) {
          for (int k = 0; k < N / 2; k++) {
            sb.append(arr[order[2]][k][j]).append(' ');
          }
          for (int k = 0; k < N / 2; k++) {
            sb.append(arr[order[3]][k][j]).append(' ');
          }
          sb.append('\n');
        }
      } else if (point == 1) {
        for (int j = 0; j < M / 2; j++) {
          for (int k = N / 2 - 1; k >= 0; k--) {
            sb.append(arr[order[0]][k][j]).append(' ');
          }
          for (int k = N / 2 - 1; k >= 0; k--) {
            sb.append(arr[order[1]][k][j]).append(' ');
          }
          sb.append('\n');
        }
        for (int j = 0; j < M / 2; j++) {
          for (int k = N / 2 - 1; k >= 0; k--) {
            sb.append(arr[order[2]][k][j]).append(' ');
          }
          for (int k = N / 2 - 1; k >= 0; k--) {
            sb.append(arr[order[3]][k][j]).append(' ');
          }
          sb.append('\n');
        }
      } else if (point == 2) {
        for (int j = M / 2 - 1; j >= 0; j--) {
          for (int k = N / 2 - 1; k >= 0; k--) {
            sb.append(arr[order[0]][k][j]).append(' ');
          }
          for (int k = N / 2 - 1; k >= 0; k--) {
            sb.append(arr[order[1]][k][j]).append(' ');
          }
          sb.append('\n');
        }
        for (int j = M / 2 - 1; j >= 0; j--) {
          for (int k = N / 2 - 1; k >= 0; k--) {
            sb.append(arr[order[2]][k][j]).append(' ');
          }
          for (int k = N / 2 - 1; k >= 0; k--) {
            sb.append(arr[order[3]][k][j]).append(' ');
          }
          sb.append('\n');
        }
      } else if (point == 3) {
        for (int j = M / 2 - 1; j >= 0; j--) {
          for (int k = 0; k < N / 2; k++) {
            sb.append(arr[order[0]][k][j]).append(' ');
          }
          for (int k = 0; k < N / 2; k++) {
            sb.append(arr[order[1]][k][j]).append(' ');
          }
          sb.append('\n');
        }
        for (int j = M / 2 - 1; j >= 0; j--) {
          for (int k = 0; k < N / 2; k++) {
            sb.append(arr[order[2]][k][j]).append(' ');
          }
          for (int k = 0; k < N / 2; k++) {
            sb.append(arr[order[3]][k][j]).append(' ');
          }
          sb.append('\n');
        }
      }
    } else {
      if (point == 0) {
        for (int i = 0; i < N / 2; i++) {
          for (int j = 0; j < M / 2; j++) {
            sb.append(arr[order[0]][i][j]).append(' ');
          }
          for (int j = 0; j < M / 2; j++) {
            sb.append(arr[order[1]][i][j]).append(' ');
          }
          sb.append('\n');
        }
        for (int i = 0; i < N / 2; i++) {
          for (int j = 0; j < M / 2; j++) {
            sb.append(arr[order[2]][i][j]).append(' ');
          }
          for (int j = 0; j < M / 2; j++) {
            sb.append(arr[order[3]][i][j]).append(' ');
          }
          sb.append('\n');
        }
      } else if (point == 1) {
        for (int i = 0; i < N / 2; i++) {
          for (int j = M / 2 - 1; j >= 0; j--) {
            sb.append(arr[order[0]][i][j]).append(' ');
          }
          for (int j = M / 2 - 1; j >= 0; j--) {
            sb.append(arr[order[1]][i][j]).append(' ');
          }
          sb.append('\n');
        }
        for (int i = 0; i < N / 2; i++) {
          for (int j = M / 2 - 1; j >= 0; j--) {
            sb.append(arr[order[2]][i][j]).append(' ');
          }
          for (int j = M / 2 - 1; j >= 0; j--) {
            sb.append(arr[order[3]][i][j]).append(' ');
          }
          sb.append('\n');
        }
      } else if (point == 2) {
        for (int i = N / 2 - 1; i >= 0; i--) {
          for (int j = M / 2 - 1; j >= 0; j--) {
            sb.append(arr[order[0]][i][j]).append(' ');
          }
          for (int j = M / 2 - 1; j >= 0; j--) {
            sb.append(arr[order[1]][i][j]).append(' ');
          }
          sb.append('\n');
        }
        for (int i = N / 2 - 1; i >= 0; i--) {
          for (int j = M / 2 - 1; j >= 0; j--) {
            sb.append(arr[order[2]][i][j]).append(' ');
          }
          for (int j = M / 2 - 1; j >= 0; j--) {
            sb.append(arr[order[3]][i][j]).append(' ');
          }
          sb.append('\n');
        }
      } else if (point == 3) {
        for (int i = N / 2 - 1; i >= 0; i--) {
          for (int j = 0; j < M / 2; j++) {
            sb.append(arr[order[0]][i][j]).append(' ');
          }
          for (int j = 0; j < M / 2; j++) {
            sb.append(arr[order[1]][i][j]).append(' ');
          }
          sb.append('\n');
        }
        for (int i = N / 2 - 1; i >= 0; i--) {
          for (int j = 0; j < M / 2; j++) {
            sb.append(arr[order[2]][i][j]).append(' ');
          }
          for (int j = 0; j < M / 2; j++) {
            sb.append(arr[order[3]][i][j]).append(' ');
          }
          sb.append('\n');
        }
      }
    }
    System.out.println(sb.toString());
  }
}