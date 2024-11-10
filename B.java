import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        Deque<Integer>[] count = new ArrayDeque[26];
        for (int i = 0; i < 26; i++) {
            count[i] = new ArrayDeque<>();
        }
        String s = br.readLine();
        for (int i = 0; i < N; i++) {
            count[s.charAt(i) - 'a'].add(i);
        }
        boolean[] removed = new boolean[N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 26; j++) {
                if (!count[j].isEmpty()) {
                    removed[count[j].pollFirst()] = true;
                    break;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (!removed[i]) {
                result.append(s.charAt(i));
            }
        }
        System.out.println(result.toString());
    }
}
