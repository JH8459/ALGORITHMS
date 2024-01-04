import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    Deque<Integer> deque = new LinkedList<>();

    for (int i = 0; i < n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      String command = st.nextToken();

      if (Objects.equals(command, "push_front")) {
        int num = Integer.parseInt(st.nextToken());

        deque.offerFirst(num);
      } else if (Objects.equals(command, "push_back")) {
        int num = Integer.parseInt(st.nextToken());

        deque.offerLast(num);
      } else if (Objects.equals(command, "pop_front")) {
        if (deque.isEmpty()){
          bw.write("-1\n");
        } else {
          bw.write(deque.pollFirst() + "\n");
        }
      } else if (Objects.equals(command, "pop_back")) {
        if (deque.isEmpty()){
          bw.write("-1\n");
        } else {
          bw.write(deque.pollLast() + "\n");
        }
      } else if (Objects.equals(command, "size")) {
        bw.write(deque.size() + "\n");
      } else if (Objects.equals(command, "empty")) {
        if (deque.isEmpty()){
          bw.write("1\n");
        } else {
          bw.write("0\n");
        }
      } else if (Objects.equals(command, "front")){
        if (deque.isEmpty()){
          bw.write("-1\n");
        } else {
          bw.write(deque.peekFirst() + "\n");
        }
      } else if (Objects.equals(command, "back")) {
        if (deque.isEmpty()) {
          bw.write("-1\n");
        } else {
          bw.write(deque.peekLast() + "\n");
        }
      }
    }

    bw.flush();
    bw.close();
  }
}