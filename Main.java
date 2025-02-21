public class Main {
	public static void main(String[] args) {
		// 테스트용 반복 횟수 (실제 MaxInt로 돌리면 실행 시간이 너무 길어지므로 예시로 1000만 번 사용)
		final int iterations = 300_000_000;

		long start, end;
		StringBuilder sb;

		// 방법 1: 개행에 char 리터럴 ('\n') 사용
		start = System.nanoTime();
		sb = new StringBuilder();
		int t = 1, temp = 1;
		for (int i = 0; i < iterations; i++) {
			sb.append(" ").append("\" ").append('\n');
		}
		end = System.nanoTime();
		double timeChar = (end - start) / 1_000_000.0;
		System.out.println("방법 1 (char '\\n') 총 실행 시간: " + timeChar + " ms");

		// 방법 2: 개행에 문자열 ("\n") 사용
		start = System.nanoTime();
		sb = new StringBuilder();
		for (int i = 0; i < iterations; i++) {
			sb.append(" ").append("\" ").append("\n");
		}
		end = System.nanoTime();
		double timeString = (end - start) / 1_000_000.0;
		System.out.println("방법 2 (String \"\\n\") 총 실행 시간: " + timeString + " ms");

		System.out.println("차이: " + Math.abs(timeChar - timeString) + " ms");
	}
}
