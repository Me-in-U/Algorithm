package P3595번_맥주_냉장고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int ij = i * j;
                if (ij > n) {
                    break;
                }
                for (int k = 1; k <= j; k++) {
                    int ijk = ij * k;
                    if (ijk > n) {
                        break;
                    }
                    if (ijk == n) {
                        int sum = (ij) + (j * k) + (k * i);
                        if (sum < min) {
                            min = sum;
                            a = i;
                            b = j;
                            c = k;
                        }
                    }
                }
            }
        }
        System.out.println(new StringBuilder().append(a).append(' ').append(b).append(' ').append(c).toString());
    }
}