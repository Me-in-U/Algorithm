package BAEKJOON.Gold.Gold_I.P2263번_트리의_순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    protected static int[] inOrder;
    protected static int[] postOrder;
    protected static int[] idxInOrder;
    protected static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        inOrder = new int[N];
        postOrder = new int[N];
        idxInOrder = new int[N + 1];
        String[] in = br.readLine().split(" ");
        String[] post = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            inOrder[i] = Integer.parseInt(in[i]);
            idxInOrder[inOrder[i]] = i;
            postOrder[i] = Integer.parseInt(post[i]);
        }
        sb = new StringBuilder();
        preOrder(0, N - 1, 0, N - 1);
        System.out.print(sb.toString());
    }

    public static void preOrder(int inStart, int inEnd, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd)
            return;
        int root = postOrder[postEnd];
        sb.append(root).append(' ');
        int rootIdx = idxInOrder[root];
        int leftSize = rootIdx - inStart;
        preOrder(inStart, rootIdx - 1, postStart, postStart + leftSize - 1);
        preOrder(rootIdx + 1, inEnd, postStart + leftSize, postEnd - 1);
    }
}
