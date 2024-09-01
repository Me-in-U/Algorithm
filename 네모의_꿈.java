import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> edgeCount = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String[] edges = br.readLine().split(" ");
            int a = Integer.parseInt(edges[0]);
            int b = Integer.parseInt(edges[1]);
            int c = Integer.parseInt(edges[2]);
            edgeCount.put(a, edgeCount.getOrDefault(a, 0) + 1);
            edgeCount.put(b, edgeCount.getOrDefault(b, 0) + 1);
            edgeCount.put(c, edgeCount.getOrDefault(c, 0) + 1);
        }
        for (int count : edgeCount.values()) {
            if (count >= 2) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }
}