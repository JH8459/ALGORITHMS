import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int t = Integer.parseInt(st.nextToken());
    int s = Integer.parseInt(st.nextToken());

    if(t >= 12 && t <= 16){
      bw.write(s == 1 ? "280\n" : "320\n");
    } else {
      bw.write("280\n");
    }

    bw.flush();
    bw.close();
  }
}