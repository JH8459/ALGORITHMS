import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    while (n-- > 0){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      String s = br.readLine();

      bw.write(getDecodedStr(s, a, b) + "\n");
    }

    bw.flush();
    bw.close();
  }

  public static String getDecodedStr (String s, int a, int b) {
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < s.length(); i++){
      char ch = (char) ((a * (s.charAt(i) - 65) + b) % 26);

      sb.append((char) (ch + 65));
    }


    return sb.toString();
  }
}