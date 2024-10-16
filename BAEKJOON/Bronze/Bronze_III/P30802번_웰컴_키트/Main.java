package P30802번_웰컴_키트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] sizes = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] TP = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int package1 = 0;
        for (int i : sizes) {
            if (i != 0) {
                package1 += i / TP[0];
                if (i % TP[0] != 0) {
                    package1++;
                }
            }
        }
        System.out.println(package1);
        System.out.println((N / TP[1]) + " " + (N % TP[1]));
    }
}