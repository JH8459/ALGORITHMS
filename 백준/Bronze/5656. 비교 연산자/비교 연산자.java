import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = 0;

    while (true){
      n++;
      StringTokenizer st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      String operator = st.nextToken();
      int b = Integer.parseInt(st.nextToken());

      boolean isMatchOperator = false;

      if(Objects.equals(operator, ">")){
        isMatchOperator = a > b;
      } else if(Objects.equals(operator, ">=")){
        isMatchOperator = a >= b;
      } else if(Objects.equals(operator, "<")){
        isMatchOperator = a < b;
      } else if(Objects.equals(operator, "<=")){
        isMatchOperator = a <= b;
      } else if(Objects.equals(operator, "==")){
        isMatchOperator = a == b;
      } else if(Objects.equals(operator, "!=")){
        isMatchOperator = a != b;
      } else {
        break;
      }

      bw.write("Case " + n + ": " + isMatchOperator + "\n");
    }

    bw.flush();
    bw.close();
  }
}