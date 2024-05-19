import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testCase = Integer.parseInt(br.readLine());

    while (testCase-- > 0){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int c = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());

      bw.write("You get " + c/v + " piece(s) and your dad gets " + c%v + " piece(s).\n");
    }

    bw.flush();
    bw.close();
  }
}