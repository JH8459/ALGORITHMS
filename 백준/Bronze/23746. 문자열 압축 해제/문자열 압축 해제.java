import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st;

    int n = Integer.parseInt(br.readLine());
    String[] compactArr = new String[26];

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());

      String compactString = st.nextToken();
      char ch = st.nextToken().charAt(0);

      compactArr[ch - 65] = compactString;
    }

    String compactString = br.readLine();
    st = new StringTokenizer(br.readLine());

    int startIndex = Integer.parseInt(st.nextToken());
    int endIndex = Integer.parseInt(st.nextToken());

    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < compactString.length(); i++){
      int x = compactString.charAt(i);

      sb.append(compactArr[x - 65]);
    }

    bw.write(sb.substring(startIndex - 1, endIndex)+ "\n");
    bw.flush();
    bw.close();
  }
}