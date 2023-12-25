import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String st = br.readLine();
    int n = Integer.parseInt(st.split(" ")[0]); // 초콜릿 가로
    int m = Integer.parseInt(st.split(" ")[1]); // 초콜릿 세로

    bw.write((n * m) - 1 + "\n");
    bw.flush();
    bw.close();
  }
}