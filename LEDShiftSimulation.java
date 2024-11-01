public class LEDShiftSimulation {
    public static void main(String[] args) {
        int PORTB = 0x80; // 초기값 0b00010000

        while (true) {
            // 현재 PORTB 값 출력
            System.out.println("PORTB: " + String.format("%8s", Integer.toBinaryString(PORTB)).replace(' ', '0'));

            // 500ms 지연 (스레드 일시 정지로 시뮬레이션)
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 오른쪽으로 1비트 시프트
            PORTB >>= 1;

            // PORTB가 모두 0이 되면 초기값으로 리셋
            if (PORTB == 0b00001000) {
                PORTB = 0b10000000;
            }
        }
    }
}
