package P31712번_핑크빈_레이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static class Player {
        int interval;
        int coolTime;
        int damage;

        Player(int interval, int damage) {
            this.interval = interval;
            this.damage = damage;
            this.coolTime = 0;
        }

        void hitBoss() {
            if (coolTime == 0) {
                bossHP -= damage;
                coolTime = interval - 1;
            } else {
                coolTime--;
            }
        }
    }

    public static int bossHP;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        Player[] players = new Player[3];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            players[i] = new Player(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        bossHP = Integer.parseInt(br.readLine());
        int time = 0;
        while (bossHP > 0) {
            for (int j = 0; j < 3; j++)
                players[j].hitBoss();
            if (bossHP > 0)
                time++;
        }
        System.out.println(time);
    }
}