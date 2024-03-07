import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int pointCnt = Integer.parseInt(br.readLine());
    int q1 = 0;
    int q2 = 0;
    int q3 = 0;
    int q4 = 0;
    int axis = 0;

    for(int i = 0; i < pointCnt; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());

      if(x > 0 && y > 0){
        q1++;
      } else if(x < 0 && y > 0){
        q2++;
      } else if(x < 0 && y < 0){
        q3++;
      } else if(x > 0 && y < 0){
        q4++;
      }else {
        axis++;
      }
    }

    bw.write("Q1: " + q1 + "\n");
    bw.write("Q2: " + q2 + "\n");
    bw.write("Q3: " + q3 + "\n");
    bw.write("Q4: " + q4 + "\n");
    bw.write("AXIS: " + axis + "\n");
    bw.flush();
    bw.close();
  }
}