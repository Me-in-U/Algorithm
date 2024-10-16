package P1991번_트리_순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    TreeOrderClass t = new TreeOrderClass();

    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      String[] input = br.readLine().split(" ", 3);
      t.createNode(input[0].charAt(0), input[1].charAt(0), input[2].charAt(0));
    }
    // System.out.println("전위 순회");
    t.preOrder(t.root);
    System.out.println();
    // System.out.println("\n중위 순회");
    t.inOrder(t.root);
    System.out.println();
    // System.out.println("\n후위 순회");
    t.postOrder(t.root);
    System.out.println();
  }
}

class Node {
  char data;
  Node left;
  Node right;

  Node(char data) {
    this.data = data;
  }
}

class TreeOrderClass {
  public Node root;

  public void createNode(char data, char leftData, char rightData) {
    if (root == null) {
      root = new Node(data);

      if (leftData != '.') {
        root.left = new Node(leftData);
      }
      if (rightData != '.') {
        root.right = new Node(rightData);
      }
    } else {
      searchNode(root, data, leftData, rightData);
    }
  }

  public void searchNode(Node node, char data, char leftData, char rightData) {
    if (node == null) {
      return;
    } else if (node.data == data) {
      if (leftData != '.') {
        node.left = new Node(leftData);
      }
      if (rightData != '.') {
        node.right = new Node(rightData);
      }
    } else {
      searchNode(node.left, data, leftData, rightData);
      searchNode(node.right, data, leftData, rightData);
    }
  }

  // 전위순회 Preorder : Root -> Left -> Right
  public void preOrder(Node node) {
    if (node != null) {
      System.out.print(node.data + "");
      if (node.left != null)
        preOrder(node.left);
      if (node.right != null)
        preOrder(node.right);
    }
  }

  // 중위 순회 Inorder : Left -> Root -> Right
  public void inOrder(Node node) {
    if (node != null) {
      if (node.left != null)
        inOrder(node.left);
      System.out.print(node.data + "");
      if (node.right != null)
        inOrder(node.right);
    }
  }

  // 후위순회 Postorder : Left -> Right -> Root
  public void postOrder(Node node) {
    if (node != null) {
      if (node.left != null)
        postOrder(node.left);
      if (node.right != null)
        postOrder(node.right);
      System.out.print(node.data + "");
    }
  }
}