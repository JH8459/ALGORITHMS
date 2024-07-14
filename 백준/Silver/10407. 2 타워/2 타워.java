import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine();

    bw.write(Objects.equals(s, "1") ? "2" : "1" + "\n");

    bw.flush();
    bw.close();
  }
}