package P5397번_키로거;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  static class Node {
    char data;
    Node nextNode;
    Node previousNode;

    Node(char data) {
      this.data = data;
      this.nextNode = null;
      this.previousNode = null;
    }

    void insert(char c) {
      Node node = new Node(c);
      Node pNode = this.previousNode;
      node.nextNode = this;
      node.previousNode = pNode;
      this.previousNode = node;
      if (pNode != null) {
        pNode.nextNode = node;
      }
    }

    void delete() {
      Node pNode = this.previousNode;
      Node ppNode = null;
      if (pNode != null) {
        ppNode = pNode.previousNode;
        this.previousNode = ppNode;
      }
      if (ppNode != null) {
        ppNode.nextNode = this;
      }
    }

    Node left() {
      if (this.previousNode != null) {
        return this.previousNode;
      }
      return this;
    }

    Node right() {
      if (this.nextNode != null) {
        return this.nextNode;
      }
      return this;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    while (T-- > 0) {
      Node c = new Node('-');
      String s = br.readLine();
      for (int i = 0; i < s.length(); i++) {
        char cc = s.charAt(i);
        if (cc == '<') {
          c = c.left();
        } else if (cc == '>') {
          c = c.right();
        } else if (cc == '-') {
          c.delete();
        } else {
          c.insert(cc);
        }
      }
      while (c.previousNode != null) {
        c = c.left();
      }
      while (c.nextNode != null) {
        sb.append(c.data);
        c = c.right();
      }
      sb.append('\n');
    }
    System.out.print(sb);
  }
}