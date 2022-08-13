package P2606번_바이러스;

import java.util.LinkedList;
import java.util.Stack;
import java.util.NoSuchElementException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Queue<T> {
  class Node<T>{
    private T data;
    private Node<T> next;

    public Node(T data){
      this.data = data;
    }
  }
  private Node<T> first;
  private Node<T> last;
  public void enqueue(T item){
    Node<T> t = new Node<T>(item);
    if(last != null){
      last.next = t;
    }
    last = t;
    if(first == null){
      first = last;
    }
  }
  public T dequeue(){
    if (first == null){
      throw new NoSuchElementException();
    }
    T data = first.data;
    first = first.next;
    if(first == null){
      last = null;
    }
    return data;
  }
  public T peek(){
    if (first == null){
      throw new NoSuchElementException();
    }
    return first.data;
  }
  public boolean isEmpty(){
    return first == null;
  }
}
/*-----------------------------------------------------*/
class Graph {
  public int count = 0;
  class Node{
    int data;
    LinkedList<Node> adjacent;
    boolean marked;
    Node (int data){
      this.data = data;
      this.marked = false;
      adjacent = new LinkedList<Node>();
    }
  }
  Node[] nodes;
  
  Graph(int size){
    nodes = new Node[size];
    for (int i =0; i < size; i++){
      nodes[i] = new Node(i);
    }
  }
  /*-----------------------------------------------------*/
  void addEdge(int i1, int i2){
    Node n1 = nodes[i1];
    Node n2 = nodes[i2];
    if(!n1.adjacent.contains(n2)){
      n1.adjacent.add(n2);
    }
    if(!n2.adjacent.contains(n2)){
      n2.adjacent.add(n2);
    }
  }
  /*-----------------------------------------------------*/
  void dfs(){
    dfs(0);
  }
  void dfs(int index){
    Node root = nodes[index];
    Stack<Node> stack = new Stack<Node>();
    stack.push(root);
    root.marked = true;
    while (!stack.isEmpty()) {
      Node r = stack.pop();
      for(Node n : r.adjacent){
        if(n.marked == false){
          n.marked = true;
          stack.push(n);
        }
      }
      visit(r);
      count++;
    }
    System.out.println(count-1);
  }
  /*-----------------------------------------------------*/
  void dfsR(){
    dfsR(0);
  }
  void dfsR(int index){
    Node r = nodes[index];
    dfsR(r);
  }
  void dfsR(Node r){
    if(r == null)
      return;
    r.marked = true;
    visit(r);
    for(Node n : r.adjacent){
      if(n.marked == false){
        dfsR(n);
      }
    }
  }
  /*-----------------------------------------------------*/
  void bfs(){
    bfs(0);
  }
  void bfs(int index){
    Node root = nodes[index];
    Queue<Node> queue = new Queue<Node>();
    queue.enqueue(root);
    root.marked = true;
    while(!queue.isEmpty()){
      Node r = queue.dequeue();
      for(Node n : r.adjacent){
        if(n.marked == false){
          n.marked = true;
          queue.enqueue(n);
        }
      }
      visit(r);
    }
  }
  /*-----------------------------------------------------*/
  void visit(Node n){
    //System.out.print(n.data + " ");
    //System.out.print(n.data + 1 + " ");
  }
}
/*
--------------------------------------
  0
 /
1 -- 3    7
|  / | \ /
| /  |  5
2 -- 4   \
          6 - 8
--------------------------------------
dfs(0)
0 1 3 5 7 6 8 4 2
bfs(0)
0 1 2 3 4 5 6 7 8
dfs(0) - Recu
0 1 2 4 3 5 6 8 7
--------------------------------------
*/
class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    
    int N = Integer.parseInt(br.readLine());
    Graph g = new Graph(N);
    
    int M = Integer.parseInt(br.readLine());
    for(int i = 0; i < M; i++){
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      g.addEdge(a-1, b-1);
      g.addEdge(b-1, a-1);
    }
    g.dfs();
    //g.bfs();
    //g.dfsR();
  }
}