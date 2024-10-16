package P31844번_창고지기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int robot = -1;
        int box = -1;
        int goal = -1;
        for (int i = 0; i < 10; i++) {
            char c = line.charAt(i);
            if (c == '@') {
                robot = i;
            } else if (c == '#') {
                box = i;
            } else if (c == '!') {
                goal = i;
            }
        }
        if (box == 0 || box == 9 || (goal < robot && robot < box) || (box < robot && robot < goal) ||
                (robot < goal && goal < box) || (box < goal && goal < robot)) {
            System.out.println(-1);
        } else {
            System.out.println(Math.abs(goal - robot) - 1);
        }
    }
}
