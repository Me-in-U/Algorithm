package P30501번_관공_어찌하여_목만_오셨소;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String suspect = "";
        boolean found = false;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            if (!found) {
                for (int j = 0; j < name.length(); j++) {
                    if (name.charAt(j) == 'S') {
                        suspect = name;
                        found = true;
                    }
                }
            }
        }
        System.out.println(suspect);
    }
}