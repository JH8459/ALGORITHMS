import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String st = br.readLine();
    int r1 = Integer.parseInt(st.split(" ")[0]);
    int s = Integer.parseInt(st.split(" ")[1]);

    int r2 = (s * 2) - r1;
    bw.write(r2 + "\n");

    bw.flush();
    bw.close();
  }
}