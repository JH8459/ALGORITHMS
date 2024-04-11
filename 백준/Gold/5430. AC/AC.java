import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    ArrayDeque<Integer> deque;
    int t = Integer.parseInt(br.readLine());

    for(int i = 0; i < t; i++){
      String p = br.readLine();
      int n = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine(), "[],");

      deque = new ArrayDeque<Integer>();

      for(int j = 0; j < n; j++){
        deque.add(Integer.parseInt(st.nextToken()));
      }

      bw.write(ac(deque, p) + "\n");
    }

    bw.flush();
    bw.close();
  }

  public static String ac (ArrayDeque<Integer> deque, String commands){
    boolean reverse = false;

    for (char command : commands.toCharArray()) {
      if (command == 'R')
        reverse = !reverse;
      else {
        if (deque.isEmpty())
          return "error";

        if (reverse)
          deque.removeLast();
        else
          deque.removeFirst();
      }
    }

    StringBuilder sb = new StringBuilder("[");
    while (!deque.isEmpty()) {
      sb.append(reverse ? deque.removeLast() : deque.removeFirst());
      if (!deque.isEmpty())
        sb.append(',');
    }
    sb.append(']');

    return sb.toString();
  }
}