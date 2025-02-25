public class ArrayAccessBenchmark {
    public static void main(String[] args) {
        int size = 100_000_000;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        // 직접 배열 접근
        long sum = 0;
        long startDirect = System.nanoTime();
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        long timeDirect = System.nanoTime() - startDirect;
        System.out.println("직접 배열 접근 시간: " + timeDirect + " ns, sum = " + sum);

        // 로컬 변수로 참조 후 접근
        sum = 0;
        long startLocal = System.nanoTime();
        int[] local = arr; // 배열을 로컬 변수로 참조
        for (int i = 0; i < size; i++) {
            sum += local[i];
        }
        long timeLocal = System.nanoTime() - startLocal;
        System.out.println("로컬 변수 참조 접근 시간: " + timeLocal + " ns, sum = " + sum);
    }
}
