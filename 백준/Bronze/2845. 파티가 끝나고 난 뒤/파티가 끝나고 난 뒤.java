import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int l = Integer.parseInt(st.nextToken());
    int p = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());

    for(int i = 1; i <= 5; i++){
      int n = Integer.parseInt(st.nextToken());
      bw.write(n - l * p + " ");
    }

    bw.write("\n");
    bw.flush();
    bw.close();
  }
}