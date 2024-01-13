import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int k = Integer.parseInt(br.readLine());
    Stack<Long> stack = new Stack<>();
    long result = 0;

    for(int i = 0; i < k; i++){
      long n = Integer.parseInt(br.readLine());

      if (n > 0){
        result += n;
        stack.push(n);  // 스택에 값 넣는다
      } else {
        result -= stack.pop();
      }
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}