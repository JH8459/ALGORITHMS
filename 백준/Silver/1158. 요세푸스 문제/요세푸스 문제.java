import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    Queue<Integer> nQueue = new LinkedList<>();

    for (int i = 1; i <= n; i++) {
      nQueue.offer(i);
    }

    sb.append("<");

    while (!nQueue.isEmpty()) {
      for (int i = 0; i < k - 1; i++) {
        nQueue.offer(nQueue.poll());
      }

      sb.append(nQueue.poll()).append(", ");
    }

    sb.delete(sb.length() - 2, sb.length());
    sb.append(">\n");

    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}