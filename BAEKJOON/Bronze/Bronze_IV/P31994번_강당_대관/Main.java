package P31994번_강당_대관;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = null;
        int max = 0;
        for (int i = 0; i < 7; i++) {
            String[] data = br.readLine().split(" ");
            int num = Integer.parseInt(data[1]);
            if (num > max) {
                max = num;
                result = data[0];
            }
        }
        System.out.println(result);
    }
}