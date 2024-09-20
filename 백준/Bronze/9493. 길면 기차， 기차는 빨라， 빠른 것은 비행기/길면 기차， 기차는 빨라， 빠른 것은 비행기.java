import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while(true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      double m = Double.parseDouble(st.nextToken());
      double a = Double.parseDouble(st.nextToken());
      double b = Double.parseDouble(st.nextToken());

      if(m == 0 && a == 0 & b == 0){
        break;
      }

      double result = Double.parseDouble(String.format("%.0f", (((m / a) - (m / b)) * 3600)));

      int hours = (int) (result / 3600);
      int minutes = (int) ((result / 60) % 60);
      int seconds = (int) (result % 60);

      bw.write(String.format("%d:%02d:%02d", hours, minutes, seconds) + "\n");
    }

    bw.flush();
    bw.close();
  }
}