package P12790번_Mini_Fantasy_War;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int HP = Integer.parseInt(st.nextToken());
            int MP = Integer.parseInt(st.nextToken());
            int atk = Integer.parseInt(st.nextToken());
            int def = Integer.parseInt(st.nextToken());
            int dHP = Integer.parseInt(st.nextToken());
            int dMP = Integer.parseInt(st.nextToken());
            int datk = Integer.parseInt(st.nextToken());
            int ddef = Integer.parseInt(st.nextToken());
            HP = (HP + dHP) < 1 ? 1 : (HP + dHP);
            MP = (MP + dMP) < 1 ? 1 : (MP + dMP);
            atk = (atk + datk) < 0 ? 0 : (atk + datk);
            def += ddef;
            sb.append((HP + (5 * MP) + (2 * (atk + def)))).append('\n');
        }
        System.out.print(sb.toString());
    }
}