import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());


    for(int i = 0; i<n; i++){
      String s = br.readLine();
      Stack<Character> stack = new Stack<>();
      boolean isSuccess = true;

      for(int j =0; j<s.length(); j++){
        char ch = s.charAt(j);

        if(ch == '('){
          stack.push(ch);
        } else {
          if(!stack.isEmpty()){
            int top = stack.peek();

            if (top == '('){
              stack.pop();
            } else {
              isSuccess = false;
            }
          } else {
            isSuccess = false;
          }
        }
      }

      if(!stack.isEmpty()) {
        isSuccess = false;
      }

      if (isSuccess) {
        bw.write("YES\n");
      } else {
        bw.write("NO\n");
      }
    }

    bw.flush();
    bw.close();
  }
}