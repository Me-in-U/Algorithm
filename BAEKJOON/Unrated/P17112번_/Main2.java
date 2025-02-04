package P17112번_;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws Exception {
        // System.in에서 원시 바이트 읽기
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int b;
        while ((b = System.in.read()) != -1) {
            baos.write(b);
        }
        byte[] inputBytes = baos.toByteArray();

        // 터미널 입력이 없으면 sample 문자열을 사용
        if (inputBytes.length == 0) {
            String sample = "ì˜ˆì œ ìž…ë ¥ë„ ì¸ì½”ë”©ë˜ì–´ ìžˆë‹¤. (ê·¸ëŸ° ì´ìœ ë¡œ ì˜ˆì œëŠ” ì±„ì ì„ í•˜ì§€ ì•ŠëŠ”ë‹¤.)";
            // sample은 이미 UTF-8로 디코딩된 상태이므로, ISO-8859-1로 재인코딩하여 원시 바이트 복원
            inputBytes = sample.getBytes("ISO-8859-1");
        }

        // 후보 인코딩 5개
        String[] candidates = { "EUC-KR", "IBM-Thai", "Shift_JIS", "UTF-8", "windows-1252" };

        String bestEnc = "";
        int bestCount = -1;

        // 각 후보 인코딩으로 inputBytes를 직접 디코딩하여 한글 복원 개수를 센다.
        for (String candidate : candidates) {
            try {
                // 후보 인코딩으로 원시 바이트를 디코딩
                String decoded = new String(inputBytes, candidate);
                // 디코딩 결과 출력
                System.out.println("[" + candidate + "]: " + decoded);
                int count = 0;
                for (int j = 0; j < decoded.length(); j++) {
                    char c = decoded.charAt(j);
                    if (c >= 0xAC00 && c <= 0xD7A3) { // 한글 유니코드 범위
                        count++;
                    }
                }
                // 한글 문자가 가장 많이 복원된 인코딩 선택
                if (count > bestCount) {
                    bestCount = count;
                    bestEnc = candidate;
                }
            } catch (Exception e) {
                // 해당 인코딩으로 디코딩 실패하면 무시
            }
        }
        // 최종 인코딩 결과 출력
        System.out.println("최종 선택 인코딩: " + bestEnc);
    }
}
