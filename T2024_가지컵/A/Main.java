package T2024_가지컵.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    protected static String[][] data = new String[10][10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            data[i] = br.readLine().split(" ");
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= 1; j++) {
                if (equals(j, i)) {
                    System.out.println(1);
                    return;
                }
            }
        }
        System.out.println(0);
    }

    public static boolean equals(int cr, int i) {
        if (cr == 0) {
            String first = data[i][0];
            for (int j = 1; j < 10; j++) {
                if (!first.equals(data[i][j])) {
                    return false;
                }
            }
        } else if (cr == 1) {
            String first = data[0][i];
            for (int j = 1; j < 10; j++) {
                if (!first.equals(data[j][i])) {
                    return false;
                }
            }
        }
        return true;
    }
}