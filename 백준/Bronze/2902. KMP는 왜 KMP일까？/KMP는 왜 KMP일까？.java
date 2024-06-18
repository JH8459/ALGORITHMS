import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine(), "-");
    StringBuilder sb = new StringBuilder();

    while (st.hasMoreTokens()){
      String name = st.nextToken();
      char ch = name.charAt(0);

      sb.append(ch);
    }

    bw.write(sb + "\n");
    bw.flush();
    bw.close();
  }
}