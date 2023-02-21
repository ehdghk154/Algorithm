/**
 * 11723 집합
 */
import java.io.*;
import java.util.Arrays;

public class Main {
  static boolean[] set;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    set = new boolean[21];
    int M = Integer.parseInt(br.readLine());
    for(int i = 0; i < M; i++) {
      String cmd = br.readLine();
      switch(cmd.charAt(0)) {
        case 'a':
          if(cmd.charAt(1) == 'd') add(Integer.parseInt(cmd.substring(4)));
          else all();
          break;
        case 'c':
          sb.append(check(Integer.parseInt(cmd.substring(6)))).append('\n');
          break;
        case 'e':
          empty();
          break;
        case 'r':
          remove(Integer.parseInt(cmd.substring(7)));
          break;
        case 't':
          toggle(Integer.parseInt(cmd.substring(7)));
          break;
      }
    }
    System.out.println(sb);
  }
  static void add(int n) {
    if(!set[n]) {
      set[n] = true;
    }
  }
  
  static void all() {
    if(!set[0]) {
      Arrays.fill(set, true);
    }
  }
  
  static int check(int n) {
    if(set[n]) return 1;
    else return 0;
  }
  
  static void empty() {
    Arrays.fill(set, false);
  }
  
  static void remove(int n) {
    if(set[n]) {
      set[n] = false;
      set[0] = false;
    }
  }
  
  static void toggle(int n) {
    set[n] = !set[n];
  }
}

/*
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  static List<Integer> list;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    list = new ArrayList<>();
    int M = Integer.parseInt(br.readLine());
    for(int i = 0; i < M; i++) {
      String cmd = br.readLine();
      switch(cmd.charAt(0)) {
        case 'a':
          if(cmd.charAt(1) == 'd') add(Integer.parseInt(cmd.substring(4)));
          else all();
          break;
        case 'c':
          sb.append(check(Integer.parseInt(cmd.substring(6)))).append('\n');
          break;
        case 'e':
          empty();
          break;
        case 'r':
          remove(Integer.parseInt(cmd.substring(7)));
          break;
        case 't':
          toggle(Integer.parseInt(cmd.substring(7)));
          break;
      }
    }
    System.out.println(sb);
  }
  
  static void add(int n) {
    if(!list.contains(n)) {
      list.add(n);
    }
  }
  
  static void all() {
    List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
    if(!list.containsAll(l)) {
      list.clear();
      for(int i = 1; i <= 20; i++) {
        list.add(i);
      }
    }
  }
  
  static int check(int n) {
    if(list.contains(n)) return 1;
    else return 0;
  }
  
  static void empty() {
    list.clear();
  }
  
  static void remove(int n) {
    if(list.contains(n)) {
      list.remove(list.indexOf(n));
    }
  }
  
  static void toggle(int n) {
    if(list.contains(n)) {
      remove(n);
    }else {
      add(n);
    }
  }
}
 */