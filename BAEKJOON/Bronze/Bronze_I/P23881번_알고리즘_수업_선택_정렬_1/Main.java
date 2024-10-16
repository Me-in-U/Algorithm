package P23881번_알고리즘_수업_선택_정렬_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int exchanged = 0;
        for (int i = N - 1; i > 0; i--) {
            int max = 0;
            int index = 0;
            for (int j = 0; j <= i; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    index = j;
                }
            }
            if (arr[i] != max) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                exchanged++;
                if (exchanged == K) {
                    System.out.println(Math.min(arr[i], arr[index]) + " " + Math.max(arr[i], arr[index]));
                    return;
                }
            }
        }
        System.out.println("-1");
    }
}