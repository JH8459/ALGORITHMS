import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < 3; i++) {
      String line = br.readLine();
      int cnt = 1, max = 1;
      char prev = line.charAt(0);

      for (int j = 1; j < 8; j++) {
        char now = line.charAt(j);

        if (now == prev) {
          cnt++;
        } else {
          max = Math.max(max, cnt);

          cnt = 1;
          prev = now;
        }

        max = Math.max(max, cnt);
      }

      bw.write(max + "\n");
    }

    bw.flush();
    bw.close();
  }
}