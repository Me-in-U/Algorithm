package P16953번_AtoB;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	private static class Data {
		long num;
		int count;

		public Data(long num, int count) {
			this.num = num;
			this.count = count;
		}
	}

	public static void main(String[] args) throws IOException {
		int A = readInt();
		int B = readInt();
		int result = bfs(A, B);
		System.out.print(new StringBuilder().append(result));
	}

	public static int bfs(long A, long B) {
		Deque<Data> queue = new ArrayDeque<>();
		queue.addLast(new Data(A, 0));
		while (!queue.isEmpty()) {
			Data temp = queue.poll();
			if (temp.num == B)
				return temp.count + 1;
			long op1 = temp.num << 1;
			long op2 = temp.num * 10 + 1;
			int nextCount = temp.count + 1;
			if (op1 <= B)
				queue.addLast(new Data(op1, nextCount));
			if (op2 <= B)
				queue.addLast(new Data(op2, nextCount));
		}
		return -1;
	}

	private static int readInt() throws IOException {
		int c;
		int n = System.in.read() & 15;
		while ((c = System.in.read()) >= 48)
			n = (n * 10) + (c & 15);
		if (c == 13)
			System.in.read();
		return n;
	}
}