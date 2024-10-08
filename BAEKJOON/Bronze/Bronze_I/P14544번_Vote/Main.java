package Bronze_I.P14544번_Vote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int P = Integer.parseInt(br.readLine());
        for (int i = 1; i <= P; i++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < N; j++) {
                map.put(br.readLine(), 0);
            }
            for (int j = 0; j < M; j++) {
                input = br.readLine().split(" ");
                map.put(input[0], map.get(input[0]) + Integer.parseInt(input[1]));
            }
            boolean isDilemma = false;
            String winner = "";
            int votes = 0;
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
            if (list.size() == 1) {
                Map.Entry<String, Integer> first = list.get(0);
                winner = first.getKey();
                votes = first.getValue();
            } else {
                Map.Entry<String, Integer> first = list.get(0);
                Map.Entry<String, Integer> second = list.get(1);
                if (first.getValue().equals(second.getValue())) {
                    isDilemma = true;
                } else {
                    winner = first.getValue() > second.getValue() ? first.getKey() : second.getKey();
                    votes = first.getValue() > second.getValue() ? first.getValue() : second.getValue();
                }
            }
            sb.append("VOTE ").append(i).append(": ");
            if (isDilemma) {
                sb.append("THERE IS A DILEMMA").append('\n');
            } else {
                sb.append("THE WINNER IS ").append(winner).append(' ').append(votes).append('\n');
            }
        }
        System.out.print(sb.toString());
    }
}