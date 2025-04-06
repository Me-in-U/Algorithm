package BAEKJOON.Gold.Gold_I.P1967번_트리의_지름;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {

  static class Node {
    int num;
    LinkedList<Node> children = new LinkedList<>();
    int weight;

    Node(int num, int weight) {
      this.num = num;
      this.weight = weight;
    }
  }

  static class Tree {
    Node root;
    int maxWeight = 0;

    Tree() {
      root = new Node(1, 0);
    }

    void createNode(Node node, int parent_num, int num, int weight) {
      if (node == null) {
        return;
      } else if (node.num == parent_num) {
        node.children.add(new Node(num, weight));
      } else {
        for (Node child : node.children) {
          createNode(child, parent_num, num, weight);
        }
      }
    }

    void findDiameter(Node node) {
      if (node.num == 1 || (node.num != 1 && node.children.size() >= 2)) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        if (!node.children.isEmpty()) {
          for (Node child : node.children) {
            pq.add(getMaxWeight(child));
          }
        }
        if (pq.size() > 1) {
          maxWeight = Math.max(maxWeight, (pq.poll() + pq.poll()));
        } else {
          maxWeight = Math.max(maxWeight, pq.poll());
        }
      }
      if (!node.children.isEmpty()) {
        for (Node child : node.children) {
          findDiameter(child);
        }
      }
    }

    int getMaxWeight(Node node) {
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      if (!node.children.isEmpty()) {
        for (Node child : node.children) {
          int get = getMaxWeight(child);
          pq.add(get);
        }
      }
      if (node.children.isEmpty()) {
        return node.weight;
      } else {
        return pq.poll() + node.weight;
      }
    }

    // void order(Node node) {
    // if (node != null) {
    // System.out.print(node.num + " ");
    // for (Node child : node.children) {
    // order(child);
    // }
    // }
    // }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Tree tree = new Tree();
    int N = Integer.parseInt(br.readLine());
    if (N == 1) {
      System.out.println("0");
    } else {
      HashSet<Integer> set = new HashSet<>();
      set.add(1);
      LinkedList<String[]> list = new LinkedList<>();
      for (int i = 0; i < N - 1; i++) {
        String[] input = br.readLine().split(" ");
        if (set.contains(Integer.parseInt(input[0]))) {
          tree.createNode(tree.root, Integer.parseInt(input[0]), Integer.parseInt(input[1]),
              Integer.parseInt(input[2]));
          set.add(Integer.parseInt(input[1]));
        } else {
          list.add(input);
        }
      }
      while (!list.isEmpty()) {
        String[] input = list.poll();
        if (set.contains(Integer.parseInt(input[0]))) {
          tree.createNode(tree.root, Integer.parseInt(input[0]), Integer.parseInt(input[1]),
              Integer.parseInt(input[2]));
        } else {
          list.add(input);
        }
      }
      // tree.order(tree.root);
      tree.findDiameter(tree.root);
      System.out.println(tree.maxWeight);
    }
  }
}