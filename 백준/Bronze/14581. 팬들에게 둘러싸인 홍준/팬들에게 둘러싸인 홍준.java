import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    bw.write(":fan::fan::fan:\n"
        + ":fan::" + str + "::fan:\n"
        + ":fan::fan::fan:");

    bw.flush();
    bw.close();
  }
}