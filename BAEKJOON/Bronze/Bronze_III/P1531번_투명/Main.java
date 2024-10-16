package P1531번_투명;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static final int SIZE = 101;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] drawing = new int[SIZE][SIZE];
        for (int i = 0; i < NM[0]; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int x = input[0]; x <= input[2]; x++) {
                for (int y = input[1]; y <= input[3]; y++) {
                    drawing[x][y]++;
                }
            }
        }
        int result = 0;
        for (int x = 1; x < SIZE; x++) {
            for (int y = 1; y < SIZE; y++) {
                if (drawing[x][y] > NM[1]) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
