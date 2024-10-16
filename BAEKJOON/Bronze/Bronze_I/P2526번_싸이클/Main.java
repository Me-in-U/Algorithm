package P2526번_싸이클;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int p = Integer.parseInt(input[1]);
        List<Integer> list = new ArrayList<>();
        int temp = n;
        while (true) {
            temp = (temp * n) % p;
            if (list.contains(temp)) {
                break;
            }
            list.add(temp);
        }
        System.out.println(list.size() - list.indexOf(temp));
    }
}
