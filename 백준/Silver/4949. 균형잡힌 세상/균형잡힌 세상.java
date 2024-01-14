import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while (true) {
      String s = br.readLine();

      if (Objects.equals(s, ".")){  // 종료 조건
        break;
      }

      boolean isBalanced = true;
      Stack<Character> stack = new Stack<>();

      for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);

        if(ch == '(' || ch == '['){
          stack.push(ch);
        } else if(ch == ')' || ch == ']') {
          if (stack.isEmpty()){ // 닫는 괄호 차례에 이미 스택이 비어있다면 불균형 문자열
            isBalanced = false;
            break;
          }

          char top = stack.peek();  // 스택 최상단 괄호 확인

          if((ch == ')' && top == '(') || (ch == ']' && top == '[')){
            stack.pop();
          } else {
            isBalanced = false;
            break;
          }
        }
      }

      if(stack.isEmpty() && isBalanced){
        bw.write("yes\n");
      } else {
        bw.write("no\n");
      }
    }

    bw.flush();
    bw.close();
  }
}