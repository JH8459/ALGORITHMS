import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int max = Integer.MIN_VALUE;
    int people = 0;

    for(int i = 1; i <= 4; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      people -= Integer.parseInt(st.nextToken());
      people += Integer.parseInt(st.nextToken());

      max = Math.max(max, people);
    }

    bw.write(max + "\n");
    bw.flush();
    bw.close();
  }
}