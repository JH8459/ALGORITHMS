import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testCase = Integer.parseInt(br.readLine());

    for(int i = 1; i <= testCase; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int dice1 = Integer.parseInt(st.nextToken());
      int dice2 = Integer.parseInt(st.nextToken());

      bw.write("Case " + i + ": " + (dice1 + dice2) + "\n");
    }

    bw.flush();
    bw.close();
  }
}