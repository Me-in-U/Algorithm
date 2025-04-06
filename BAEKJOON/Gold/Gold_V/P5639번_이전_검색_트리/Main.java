package BAEKJOON.Gold.Gold_V.P5639번_이전_검색_트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
  int num;
  Node left;
  Node right;

  Node(int num) {
    this.num = num;
  }
}

class Tree {
  public Node root;

  public void insert(int num) {
    Node new_node = new Node(num);
    if (root == null) {
      root = new_node;
    } else {
      Node current_node = root;
      while (true) {
        if (num < current_node.num) {
          if (current_node.left == null) {
            current_node.left = new_node;
            break;
          } else
            current_node = current_node.left;
        } else {
          if (current_node.right == null) {
            current_node.right = new_node;
            break;
          } else
            current_node = current_node.right;
        }
      }

    }
  }

  public void postOrder(Node node) {
    if (node != null) {
      if (node.left != null)
        postOrder(node.left);
      if (node.right != null)
        postOrder(node.right);
      System.out.println(node.num);
    }
  }
}

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Tree tree = new Tree();
    String line = "";
    while ((line = br.readLine()) != null) {
      tree.insert(Integer.parseInt(line));
    }
    tree.postOrder(tree.root);
  }
}