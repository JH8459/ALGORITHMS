import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int total = 0;

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int student = Integer.parseInt(st.nextToken());
      int apple = Integer.parseInt(st.nextToken());

      total += apple % student;
    }

    bw.write(total + "\n");
    bw.flush();
    bw.close();
  }
}