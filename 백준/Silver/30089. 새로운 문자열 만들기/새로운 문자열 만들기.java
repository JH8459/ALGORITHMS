import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    while (t-- > 0){
      StringBuilder sb = new StringBuilder(br.readLine());
      boolean isSame;

      for(int i = 0; i < sb.length(); i++){
        isSame = true;

        for (int j = 0; i + j < sb.length(); j++) {
          if(sb.charAt(i + j) != sb.charAt(sb.length() - 1 - j)){
            isSame = false;
            break;
          }
        }

        if(isSame){
          for (int j = i - 1; j >= 0; j--) {
            sb.append(sb.charAt(j));
          }
          break;
        }
      }

      bw.write(sb + "\n");
    }

    bw.flush();
    bw.close();
  }
}