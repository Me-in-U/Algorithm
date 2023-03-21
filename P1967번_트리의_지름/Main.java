package P1967번_트리의_지름;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  static class Node {
    int num;
    Node left;
    Node right;
    int weight;

    Node(int num, int weight) {
      this.num = num;
      this.weight = weight;
    }
  }

  static class Tree {
    Node root;
    int maxWeight = 0;
    int tempWeight;

    Tree() {
      root = new Node(0, 0);
    }

    void createNode(int parent_num, int num, int weight) {
      if (root.left == null) {
        root.left = new Node(num, weight);
      } else if (root.right == null) {
        root.right = new Node(num, weight);
      } else {
        searchNode(root, parent_num, num, weight);
      }
    }

    void searchNode(Node node, int parent_num, int num, int weight) {
      if (node == null) {
        return;
      } else if (node.num == parent_num) {
        if (node.left == null) {
          node.left = new Node(num, weight);
        } else {
          node.right = new Node(num, weight);
        }
      } else {
        searchNode(node.left, parent_num, num, weight);
        searchNode(node.right, parent_num, num, weight);
      }
    }

    void findDiameter(Node node) {

    }

  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Tree tree = new Tree();
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N - 1; i++) {
      String[] input = br.readLine().split(" ");
      tree.createNode(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2]));
    }
    System.out.println();
    System.out.println(tree.findDiameter(tree.root));
  }
}