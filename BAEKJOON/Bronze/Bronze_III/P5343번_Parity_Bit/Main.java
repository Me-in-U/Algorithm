package BAEKJOON.Bronze.Bronze_III.P5343번_Parity_Bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String data = br.readLine();
            int errorCount = 0;
            for (int i = 0; i < data.length(); i += 8) {
                if (!parityCheck(data.substring(i, i + 8))) {
                    errorCount++;
                }
            }
            sb.append(errorCount).append('\n');
        }
        System.out.print(sb.toString());
    }

    public static boolean parityCheck(String _8bitData) {
        int oneCount = 0;
        for (int i = 0; i < 7; i++) {
            if (_8bitData.charAt(i) == '1') {
                oneCount++;
            }
        }
        char parity = oneCount % 2 == 0 ? '0' : '1';
        return parity == _8bitData.charAt(7);
    }
}
