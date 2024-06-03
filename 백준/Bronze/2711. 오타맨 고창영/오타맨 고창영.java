import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testCase = Integer.parseInt(br.readLine());

    for(int i = 0 ; i < testCase; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      StringBuilder sb = new StringBuilder();

      int wrongNum = Integer.parseInt(st.nextToken());
      String word = st.nextToken();

      sb.append(word);
      sb.deleteCharAt(wrongNum-1);

      bw.write(sb.toString() + "\n");
    }

    bw.flush();
    bw.close();
  }
}