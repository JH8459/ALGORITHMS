import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true){
      StringBuilder sb = new StringBuilder();
      String n = br.readLine();
      int result = Integer.parseInt(n);

      if(Objects.equals(n, "0")){
        break;
      }

      while (true){
        sb.append(result + " ");
        n = String.valueOf(result);

        if(result < 10){
          break;
        }

        result = getMultipleNum(n);
      }

      bw.write(sb + "\n");
    }

    bw.flush();
    bw.close();
  }

  public static int getMultipleNum(String n){
    int result = 1;

    for(int i = 0; i < n.length(); i++){
      result *= Integer.parseInt(String.valueOf(n.charAt(i)));
    }

    return result;
  }
}