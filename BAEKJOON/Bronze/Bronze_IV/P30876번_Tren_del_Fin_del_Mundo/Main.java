package P30876번_Tren_del_Fin_del_Mundo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String result = "";
        int min = 1001;
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            int y = Integer.parseInt(temp.split(" ")[1]);
            if (min > y) {
                result = temp;
                min = y;
            }
        }
        System.out.println(result);
    }
}