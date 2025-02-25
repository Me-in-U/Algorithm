package P17112번_;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "windows-1252"));
        // int b;
        StringBuilder sb = new StringBuilder();
        // while ((b = System.in.read()) != -1 && b != 13 && b != 10) {
        // baos.write(b);
        // sb.append(b).append(' ');
        // }
        // byte[] rawBytes = baos.toByteArray();
        byte[] rawBytes = br.readLine().getBytes("windows-1252");
        System.out.println(Arrays.toString(rawBytes));
        System.out.println(sb.toString());
        // 만약 터미널 입력이 없으면(예시 테스트용) 하드코딩된 sample 사용
        if (rawBytes.length == 0) {
            String sample = "ì˜ˆì œ ìž…ë ¥ë„ ì¸ì½”ë”©ë˜ì–´ ìžˆë‹¤. (ê·¸ëŸ° ì´ìœ ë¡œ ì˜ˆì œëŠ” ì±„ì ì„ í•˜ì§€ ì•ŠëŠ”ë‹¤.)";
            rawBytes = sample.getBytes("windows-1252");
        }

        // 2. 후보 인코딩 5개
        String[] candidates = { "EUC-KR", "IBM-Thai", "Shift_JIS", "UTF-8", "windows-1252" };

        // 3. 각 후보 charset으로 원시 바이트를 해석한 후 UTF‑8 문자열로 재복구
        String bestEnc = "";
        int bestCount = -1;
        for (String candidate : candidates) {
            try {
                // candidate charset으로 해석하여 문자열 생성 (이때 Unicode String으로 디코딩됨)
                String decoded = new String(rawBytes, candidate);
                System.out.println("decoded: " + decoded);
                // 필요시, 이 문자열을 candidate 바이트로 재인코딩 후 다시 UTF-8 문자열로 생성 (실제 복구 효과)
                byte[] utf8Bytes = decoded.getBytes(candidate);
                String recovered = new String(utf8Bytes, "UTF-8");

                // 복구 결과 출력
                System.out.println("[" + candidate + "]: " + recovered);

                // 한글 복원 정도 측정을 위해 한글 문자의 수 센다.
                int count = 0;
                for (int j = 0; j < recovered.length(); j++) {
                    char c = recovered.charAt(j);
                    if (c >= 0xAC00 && c <= 0xD7A3) { // 한글 유니코드 범위
                        count++;
                    }
                }
                if (count > bestCount) {
                    bestCount = count;
                    bestEnc = candidate;
                }
            } catch (Exception e) {
                System.out.println("[" + candidate + "]: 디코딩 에러 발생");
            }
        }
        // 최종 선택된 인코딩 출력
        System.out.println("최종 선택 인코딩: " + bestEnc);
    }
}
