/*
 * 1991 트리 순회
 */
import java.io.*;
import java.util.*;
// 배열 사용 
public class Main {
  static char[][] tree;
  static int N;
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    N = Integer.parseInt(br.readLine());
    tree = new char[N][3];
    
    for(int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      tree[i][0] = st.nextToken().charAt(0);
      tree[i][1] = st.nextToken().charAt(0);
      tree[i][2] = st.nextToken().charAt(0);
    }
    
    preOrder(tree[0][0]);
    System.out.println();
    inOrder(tree[0][0]);
    System.out.println();
    postOrder(tree[0][0]);
  }
  
  /* 전위 순회*/
  public static void preOrder(char root) {
    
    
    for(int i = 0; i < N; i++) {
      
      if(tree[i][0] == root) {
        
        System.out.print(root);
        
        if(tree[i][1] != '.') 
          preOrder(tree[i][1]);
        
        if(tree[i][2] != '.')
          preOrder(tree[i][2]);
        
        break;
        
      }
    }
  }

  /* 중위 순회*/
  public static void inOrder(char root) {
    
    for(int i = 0; i < N; i++) {
      
      if(tree[i][0] == root) {
        
        if(tree[i][1] != '.') 
          inOrder(tree[i][1]);
        
        System.out.print(root);
        
        if(tree[i][2] != '.')
          inOrder(tree[i][2]);
        
        break;
        
      }
    }
  }

  /* 후위 순회*/
  public static void postOrder(char root) {

    for(int i = 0; i < N; i++) {
      
      if(tree[i][0] == root) {
        
        if(tree[i][1] != '.') 
          postOrder(tree[i][1]);
        
        if(tree[i][2] != '.')
          postOrder(tree[i][2]);
        
        System.out.print(root);
        
        break;
        
      }
    }
  }
}

/* Node클래스 생성/사용 풀이
import java.io.*;
import java.util.*;

class Node {
  char root;
  Node leftNode;
  Node rightNode;
  
  Node(char root, Node leftNode, Node rightNode) {
    this.root = root;
    this.leftNode = leftNode;
    this.rightNode = rightNode;
  }
}

public class Main {
  static Node rootNode = new Node('A', null, null);
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int N = Integer.parseInt(br.readLine());
    
    
    for(int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      
      char root = st.nextToken().charAt(0);
      char leftNode = st.nextToken().charAt(0);
      char rightNode = st.nextToken().charAt(0);
      
      insertNode(rootNode, root, leftNode, rightNode);
    }
    
    preOrder(rootNode);
    System.out.println();
    inOrder(rootNode);
    System.out.println();
    postOrder(rootNode);
  }
  
  public static void insertNode(Node head, char root, char leftNode, char rightNode) {
    if(head.root == root) {
      
      if(leftNode == '.')
        head.leftNode = null;
      else
        head.leftNode = new Node(leftNode, null, null);
      
      if(rightNode == '.')
        head.rightNode = null;
      else
        head.rightNode = new Node(rightNode, null, null);
      
    }else {
      
      if(head.leftNode != null) 
        insertNode(head.leftNode, root, leftNode, rightNode);
      
      if(head.rightNode != null)
        insertNode(head.rightNode, root, leftNode, rightNode);
      
    }
  }
  // 전위 순회
  public static void preOrder(Node node) {
    if(node == null) return;
    
    System.out.print(node.root);
    
    preOrder(node.leftNode);
    
    preOrder(node.rightNode);
  }
  // 중위 순회
  public static void inOrder(Node node) {
    if(node == null) return;
    
    inOrder(node.leftNode);
    
    System.out.print(node.root);
    
    inOrder(node.rightNode);
  }
  // 후위 순회
  public static void postOrder(Node node) {
    if(node == null) return;
    
    postOrder(node.leftNode);
    
    postOrder(node.rightNode);
    
    System.out.print(node.root);
  }
}
*/
