package P31009번_진주로_가자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int jinju_fee = 0;
        int count = 0;
        int[] fees = new int[N];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            if (input[0].equals("jinju"))
                jinju_fee = Integer.parseInt(input[1]);
            fees[i] = Integer.parseInt(input[1]);
        }
        for (int i = 0; i < fees.length; i++)
            if (fees[i] > jinju_fee)
                count++;
        System.out.println(jinju_fee);
        System.out.println(count);
    }
}