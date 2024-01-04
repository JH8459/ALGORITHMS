import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int last = 0;
    Queue<Integer> queue = new LinkedList<>();

    for (int i = 0; i < n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      String command = st.nextToken();

      if (Objects.equals(command, "push")) {
        int num = Integer.parseInt(st.nextToken());
        last = num;

        queue.add(num);
      } else if (Objects.equals(command, "pop")) {
        if (queue.isEmpty()){
          bw.write("-1\n");
        } else {
          bw.write(queue.poll() + "\n");
        }
      } else if (Objects.equals(command, "size")) {
        bw.write(queue.size() + "\n");
      } else if (Objects.equals(command, "empty")) {
        if (queue.isEmpty()){
          bw.write("1\n");
        } else {
          bw.write("0\n");
        }
      } else if (Objects.equals(command, "front")){
        if (queue.isEmpty()){
          bw.write("-1\n");
        } else {
          bw.write(queue.peek() + "\n");
        }
      } else if (Objects.equals(command, "back")) {
        if (queue.isEmpty()) {
          bw.write("-1\n");
        } else {
          bw.write(last + "\n");
        }
      }
    }

    bw.flush();
    bw.close();
  }
}