package P15780번_멀티탭_충분하니;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int count = 0;
        String[] A = br.readLine().split(" ");
        for (String a : A) {
            int aa = Integer.parseInt(a);
            count += aa / 2;
            if (aa % 2 == 1) {
                count++;
            }
        }
        System.out.println(count >= N ? "YES" : "NO");
    }
}