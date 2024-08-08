import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int width = Math.abs((int) Math.ceil(b / 4.0) - (int) Math.ceil(a / 4.0));
    int height = Math.abs(((b - 1) % 4) - ((a - 1) % 4));

    bw.write(width + height + "\n");
    bw.flush();
    bw.close();
  }
}