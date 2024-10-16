package P11795번_Donation_Packaging;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int setA = 0;
        int setB = 0;
        int setC = 0;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            setA += input[0];
            setB += input[1];
            setC += input[2];
            if (setA >= 30 && setB >= 30 && setC >= 30) {
                int minimum = Math.min(setA, Math.min(setB, setC));
                setA -= minimum;
                setB -= minimum;
                setC -= minimum;
                sb.append(minimum);
            } else {
                sb.append("NO");
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}