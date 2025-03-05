import java.util.PriorityQueue;

public class PriorityQueueBenchmark {
    public static void main(String[] args) {
        final int N = 1_000_000;
        int[] data = new int[N];
        // 데이터를 미리 준비 (예제에서는 순차적인 정수를 사용)
        for (int i = 0; i < N; i++) {
            data[i] = i;
        }

        // warm-up (JIT 컴파일을 위해 간단히 실행)
        PriorityQueue<Integer> warmup = new PriorityQueue<>(N);
        for (int i = 0; i < N; i++) {
            warmup.add(data[i]);
        }

        // add 메서드를 사용한 경우의 벤치마크
        PriorityQueue<Integer> pqAdd = new PriorityQueue<>(N);
        long startAdd = System.nanoTime();
        for (int i = 0; i < N; i++) {
            pqAdd.add(data[i]);
        }
        long endAdd = System.nanoTime();
        long durationAdd = endAdd - startAdd;

        // offer 메서드를 사용한 경우의 벤치마크
        PriorityQueue<Integer> pqOffer = new PriorityQueue<>(N);
        long startOffer = System.nanoTime();
        for (int i = 0; i < N; i++) {
            pqOffer.offer(data[i]);
        }
        long endOffer = System.nanoTime();
        long durationOffer = endOffer - startOffer;

        System.out.println("Add time: " + durationAdd + " ns");
        System.out.println("Offer time: " + durationOffer + " ns");
    }
}
