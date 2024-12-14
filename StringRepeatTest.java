public class StringRepeatTest {
    public static void main(String[] args) {
        int N = 10000;
        String str = "@";

        // Test repeat()
        long startRepeat = System.nanoTime();
        String resultRepeat = str.repeat(N);
        long endRepeat = System.nanoTime();
        System.out.println("String.repeat() Time: " + (endRepeat - startRepeat) + " ns");

        // Test loop with StringBuilder
        long startLoop = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(str);
        }
        String resultLoop = sb.toString();
        long endLoop = System.nanoTime();
        System.out.println("StringBuilder Loop Time: " + (endLoop - startLoop) + " ns");
    }
}
