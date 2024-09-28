import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 양파_실험 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int app = Integer.parseInt(input[1]);
        int cur = Integer.parseInt(input[2]);
        int appOni = 1;
        int curOni = 1;
        boolean roleChanged = false;
        while (N-- > 0) {
            appOni += !roleChanged ? app : cur;
            curOni += !roleChanged ? cur : app;
            roleChanged = appOni < curOni;
            if (appOni == curOni) {
                curOni--;
            }
        }
        System.out.println(new StringBuilder().append(!roleChanged ? appOni : curOni).append(' ')
                .append(!roleChanged ? curOni : appOni));
    }
}