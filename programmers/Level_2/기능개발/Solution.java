package programmers.Level_2.기능개발;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] progresses = { 99, 90, 99, 99, 80, 99 };
        int[] speeds = { 1, 1, 1, 1, 1, 1 };
        int[] result = solution(progresses, speeds);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        int[] days = new int[progresses.length];
        for (int i = 0; i < days.length; i++) {
            days[i] = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
        }
        int maxDay = days[0];
        int count = 1;
        for (int i = 1; i < days.length; i++) {
            if (maxDay >= days[i]) {
                count++;
            } else if (maxDay < days[i]) {
                result.add(count);
                maxDay = days[i];
                count = 1;
            }
        }
        result.add(count);
        return result.stream().mapToInt(i -> i).toArray();
    }
}