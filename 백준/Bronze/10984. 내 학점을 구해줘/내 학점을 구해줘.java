import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    for(int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine());

      int totalScore = 0;
      double gpa = 0;

      for (int j = 0; j < n; j++) {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken());
        double g = Double.parseDouble(st.nextToken());

        totalScore += c;
        gpa += (g * c);
      }

      bw.write(totalScore + " " + String.format("%.1f", (gpa / totalScore)) + "\n");
    }

    bw.flush();
    bw.close();
  }
}