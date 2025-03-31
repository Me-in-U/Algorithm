package SWEA.P2383번_점심_식사_시간;

/**
 * <h1>SW Expert Academy 2383번 점심 식사 시간</h1>
 * <p>
 * JAVA 8 : 메모리 32,620 KB, 시간 170ms <br>
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-03-27
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_2383_점심식사시간_김민규 {
    private static class Person implements Comparable<Person> {
        int x, y;
        int remainedStairs;
        int remainedDistance;

        Person(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Person o) {
            return this.remainedDistance - o.remainedDistance;
        }
    }

    private static class Stair {
        int x, y, length;
        List<Person> goingDown = new ArrayList<>(3);
        List<Person> reaching = new ArrayList<>(10);

        Stair(int x, int y, int K) {
            this.x = x;
            this.y = y;
            this.length = K;
        }

        public void goDown() {
            goingDown.forEach(person -> person.remainedStairs--);
            for (int i = 0; i < goingDown.size();) {
                if (goingDown.get(i).remainedStairs == 0) {
                    goingDown.remove(i);
                } else {
                    i++;
                }
            }
        }

        public void moveOne() {
            reaching.forEach(person -> person.remainedDistance--);
            if (goingDown.size() < 3) {
                for (int i = 0; i < reaching.size();) {
                    if (reaching.get(i).remainedDistance <= 0) {
                        reaching.get(i).remainedStairs = this.length;
                        goingDown.add(reaching.remove(i));
                        if (goingDown.size() == 3) {
                            break;
                        }
                    } else {
                        i++;
                    }
                }
            }
        }

        public boolean isAllEmpty() {
            return goingDown.isEmpty() && reaching.isEmpty();
        }
    }

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            List<Person> persons = new ArrayList<>(10);
            Stair[] stairs = { null, null };
            int time = 0;
            int minTime = Integer.MAX_VALUE;
            int N = readInt();
            int c = 0;
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < N; y++) {
                    c = readInt();
                    if (c == 1) {
                        Person person = new Person(x, y);
                        persons.add(person);
                    } else if (1 < c) {
                        if (stairs[0] == null) {
                            stairs[0] = new Stair(x, y, c);
                        } else {
                            stairs[1] = new Stair(x, y, c);
                        }
                    }
                }
            }
            for (int i = 0; i < (1 << persons.size()); i++) {
                time = 0;
                for (int shift = 0; shift < persons.size(); shift++) {
                    Person temp = persons.get(shift);
                    if ((i & (1 << shift)) == 0) {
                        temp.remainedDistance = Math.abs(temp.x - stairs[0].x) + Math.abs(temp.y - stairs[0].y) + 2;
                        stairs[0].reaching.add(temp);
                    } else {
                        temp.remainedDistance = Math.abs(temp.x - stairs[1].x) + Math.abs(temp.y - stairs[1].y) + 2;
                        stairs[1].reaching.add(temp);
                    }
                }
                for (int j = 0; j < 2; j++) {
                    Collections.sort(stairs[j].reaching);
                }
                while (!stairs[0].isAllEmpty() || !stairs[1].isAllEmpty()) {
                    time++;
                    for (int j = 0; j < 2; j++) {
                        stairs[j].moveOne();
                        stairs[j].goDown();
                    }
                }
                minTime = Math.min(minTime, time);
            }
            sb.append("#").append(t).append(" ").append(minTime).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        while ((c = System.in.read()) == ' ' || c == '\n' || c == '\r')
            ;
        n = c & 15;
        while ((c = System.in.read()) > 47) {
            n = n * 10 + (c & 15);
        }
        return n;
    }
}
