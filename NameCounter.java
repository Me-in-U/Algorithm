import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NameCounter {
    /**
     * 엔터(\n)로 구분된 이름 목록에서 각 이름의 등장 횟수를 계산해 Map으로 반환
     *
     * @param input 엔터로 구분된 이름들 (예: "홍길동\n이몽룡\n홍길동")
     * @return 이름 → 등장 횟수
     */
    public static Map<String, Integer> countNames(String input) {
        Map<String, Integer> counts = new HashMap<>();
        // 줄 구분자(Windows 포함)를 모두 처리
        String[] names = input.split("\\r?\\n");
        for (String name : names) {
            if (name.isEmpty())
                continue; // 빈 줄 무시 (예: 마지막 개행)
            counts.put(name, counts.getOrDefault(name, 0) + 1);
        }
        return counts;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) { // EOF 전까지
            if (!line.trim().isEmpty()) {
                sb.append(line).append("\n");
            }
        }
        // value 총합 계산 및 출력 추가
        Map<String, Integer> result = countNames(sb.toString());
        List<Map.Entry<String, Integer>> list = new ArrayList<>(result.entrySet());
        list.sort(Map.Entry.<String, Integer> comparingByValue().reversed());

        // 유니크 이름 수
        System.out.println("전체: " + list.size() + "명");
        // value 총합 계산
        int totalCount = result.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("총합: " + totalCount + "회");

        for (Map.Entry<String, Integer> e : list) {
            System.out.printf("%s → %d회%n", e.getKey(), e.getValue());
        }

    }
}
