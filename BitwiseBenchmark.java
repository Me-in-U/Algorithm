public class BitwiseBenchmark {
    public static void main(String[] args) {
        final int ITER = 1_000_000_000;
        long sum = 0; // 루프 최적화를 막기 위해 사용

        // i & 1 벤치마크
        long start = System.nanoTime();
        for (int i = 0; i < ITER; i++) {
            sum += (i & 1);
        }
        long duration1 = System.nanoTime() - start;

        // i & -i 벤치마크
        start = System.nanoTime();
        for (int i = 0; i < ITER; i++) {
            sum += (i & -i);
        }
        long duration2 = System.nanoTime() - start;

        System.out.println("i & 1 연산 시간: " + duration1 + " ns");
        System.out.println("i & -i 연산 시간: " + duration2 + " ns");
        System.out.println("Sum: " + sum); // 최적화 제거용 출력
    }
}
