package P23971번_ZOAC_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] HWNM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int H = HWNM[0];
        int W = HWNM[1];
        int N = HWNM[2];
        int M = HWNM[3];
        int r = (int) Math.ceil((double) H / (N + 1));
        int c = (int) Math.ceil((double) W / (M + 1));
        System.out.println(r * c);
    }
}
