package BAEKJOON.Bronze.Bronze_IV.P24768번_Left_Brrhined;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            int sweet = Integer.parseInt(st.nextToken());
            int sour = Integer.parseInt(st.nextToken());
            if (sweet == 0 && sour == 0) {
                break;
            }
            if (sweet + sour == 13) {
                sb.append("Never speak again.\n");
            } else if (sour > sweet) {
                sb.append("Left beehind.\n");
            } else if (sweet > sour) {
                sb.append("To the convention.\n");
            } else {
                sb.append("Undecided.\n");
            }
        }
        System.out.print(sb.toString());
    }
}
