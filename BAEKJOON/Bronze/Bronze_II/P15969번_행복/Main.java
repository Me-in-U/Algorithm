package P15969번_행복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < N; i++)
            num.add(Integer.parseInt(nums[i]));
        System.out.println(Collections.max(num) - Collections.min(num));
    }
}