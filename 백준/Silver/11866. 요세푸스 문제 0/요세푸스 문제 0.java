import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    Queue<Integer> queue = new LinkedList<>();


    for(int i = 1; i <= n; i++){
      queue.add(i);
    }

    String s = "<";

    while (!queue.isEmpty()){
      for (int i = 0; i < k - 1; i++){
        queue.add(queue.poll());
      }

      s = s + queue.poll() + ", ";
    }

    bw.write(s.substring(0, s.length() - 2) + ">");
    bw.flush();
    bw.close();
  }
}