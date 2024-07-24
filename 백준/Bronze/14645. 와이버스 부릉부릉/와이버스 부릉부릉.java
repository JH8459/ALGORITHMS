import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    for(int i = 0; i < n; i++){
      st = new StringTokenizer(br.readLine());

      k += Integer.parseInt(st.nextToken());
      k -= Integer.parseInt(st.nextToken());
    }

    bw.write("비와이\n");

    bw.flush();
    bw.close();
  }
}