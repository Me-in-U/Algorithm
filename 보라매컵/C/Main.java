package 보라매컵.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  public static final int MOD = 1000000007;
  public static int N;
  public static List<Integer>[] graph;

  public static void main(String[] args) throws IOException {
    // !입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken()); // 지점의 수
    int M = Integer.parseInt(st.nextToken()); // 도로의 수
    graph = new ArrayList[N + 1];
    for (int i = 0; i <= N; i++) {
      graph[i] = new ArrayList<>();
    }
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      graph[a].add(b);
      graph[b].add(a);
    }

    // // !풀이
    // List<Set<Integer>> validCombinations = new ArrayList<>();
    // int validCombinationsCount = 0;
    // // !모든 경우의 수 확인(비트마스크)
    // for (int mask = 1; mask < (1 << N); mask++) {
    // Set<Integer> combination = new HashSet<>();
    // for (int j = 0; j < N; j++) {
    // if ((mask & (1 << j)) > 0) {
    // combination.add(j + 1);
    // }
    // }
    // // System.out.println(combination);
    // if (isValidCombination(combination)) {
    // validCombinations.add(combination);
    // validCombinationsCount = ++validCombinationsCount % MOD;
    // }
    // }
    // // !출력
    // // System.out.println(validCombinationsCount);
    // System.out.println("가능한 차량 배치 조합의 수: " + validCombinations.size());
    // for (Set<Integer> combination : validCombinations) {
    // System.out.println(combination);
    // }

    int[] dp = new int[N + 1];
    Arrays.fill(dp, -1);
    dp[1] = 0; // 1번 지점에서 출발하는 차량은 도착 시간이 0입니다.
    // 충돌 검사와 결과 계산
    int validCombinationsCount = 0;
    for (int i = 1; i <= N; i++) {
      boolean isValid = true;
      int arrival = dfs(i, dp);
      for (int neighbor : graph[i]) {
        if (arrival == dfs(neighbor, dp)) {
          isValid = false;
          break;
        }
      }
      if (isValid)
        validCombinationsCount++;
    }
    validCombinationsCount = (int) Math.pow(2, validCombinationsCount) % 1_000_000_007;
    System.out.println(validCombinationsCount);
  }

  // !BFS 충돌이 발생하지 않는지 확인
  public static boolean isValidCombination(Set<Integer> combination) {
    int[] arrivalTime = new int[N + 1];
    Arrays.fill(arrivalTime, Integer.MAX_VALUE);
    arrivalTime[1] = 0;
    Queue<Integer> queue = new LinkedList<>();
    queue.add(1);
    while (!queue.isEmpty()) {
      int current = queue.poll();
      for (int next : graph[current]) {
        if (arrivalTime[next] > arrivalTime[current] + 1) {
          arrivalTime[next] = arrivalTime[current] + 1;
          queue.add(next);
        }
      }
    }
    for (int node : combination) {
      for (int neighbor : graph[node]) {
        if (combination.contains(neighbor) && arrivalTime[node] == arrivalTime[neighbor]) {
          return false; // 충돌
        }
      }
    }
    return true;
  }

  // DFS와 메모이제이션을 사용한 새로운 메서드 추가
  public static int dfs(int current, int[] dp) {
    if (dp[current] != -1)
      return dp[current];
    dp[current] = Integer.MAX_VALUE;
    for (int next : graph[current]) {
      int arrival = dfs(next, dp) + 1;
      dp[current] = Math.min(dp[current], arrival);
    }
    return dp[current];
  }
}
