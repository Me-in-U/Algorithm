package 카툰컵.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalCount = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String S = st.nextToken();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String[] itemName = st.nextToken().split("_");
            int amount = Integer.parseInt(st.nextToken());
            for (String subName : itemName) {
                if (subName.equals(S)) {
                    totalCount += amount;
                    break;
                }
            }
        }
        System.out.println(totalCount);
    }
}