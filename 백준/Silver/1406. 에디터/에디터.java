import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine();
    int cursor = s.length();
    int n = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    sb.append(s);

    for(int i = 0; i < n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      String command = st.nextToken();

      switch (command){
        case "L":
          if(cursor > 0){
            cursor -= 1;
          }
          break;
        case "D":
          if(cursor < sb.length()){
            cursor += 1;
          }
          break;
        case "B":
          if(cursor > 0){
            sb.deleteCharAt(cursor - 1);
            cursor -= 1;
          }
          break;
        case "P":
          String word = st.nextToken();

          sb.insert(cursor, word);
          cursor += 1;
          break;
      }
    }

    bw.write(sb + "\n");
    bw.flush();
    bw.close();
  }
}