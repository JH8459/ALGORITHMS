import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      String command = st.nextToken();

      if (Objects.equals(command, "push")) {
        int num = Integer.parseInt(st.nextToken());

        stack.push(num);
      } else if (Objects.equals(command, "pop")) {
        if (stack.isEmpty()){
          bw.write("-1\n");
        } else {
          bw.write(stack.pop() + "\n");
        }
      } else if (Objects.equals(command, "size")) {
        bw.write(stack.size() + "\n");
      } else if (Objects.equals(command, "empty")) {
        if (stack.isEmpty()){
          bw.write("1\n");
        } else {
          bw.write("0\n");
        }
      } else if (Objects.equals(command, "top")){
        if (stack.isEmpty()){
          bw.write("-1\n");
        } else {
          bw.write(stack.peek() + "\n");
        }
      }
    }

    bw.flush();
    bw.close();
  }
}