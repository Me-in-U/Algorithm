package P15312번_이름_궁합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Deque;
import java.util.ArrayDeque;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int alph[] = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
    Deque<Integer> deque = new ArrayDeque<>();

    //입력
		String A = br.readLine();
    String B = br.readLine();
		for(int i = 0; i < A.length(); i++){
      int c1 = A.charAt(i) - 65;
      int c2 = B.charAt(i) - 65;
      deque.add(alph[c1]);
      deque.add(alph[c2]);
		}

    //계산
    //System.out.println(deque);
    int level = (A.length() * 2) - 1;
    while(deque.size() > 2) {
      for(int i = 1; i <= level; i++){
        int a = deque.poll();
        int b = deque.poll();
        deque.add((a + b) % 10);
        if(i != level){
          deque.addFirst(b);
        }
      }
      //System.out.println(deque);
      level--;
    }
    
    String a1 = Integer.toString(deque.poll());
    String a2 = Integer.toString(deque.poll());
    System.out.println(a1 + a2);
  }
}