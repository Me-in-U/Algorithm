package P31608번_Hamming_Distance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s1 = br.readLine();
        String s2 = br.readLine();
        int count = 0;
        for (int i = 0; i < N; i++)
            if (s1.charAt(i) != s2.charAt(i))
                count++;
        System.out.println(count);
    }
}