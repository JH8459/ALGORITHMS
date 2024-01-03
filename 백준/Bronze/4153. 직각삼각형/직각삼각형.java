import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while (true){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int[] triangleArr = new int[3];

      triangleArr[0] = Integer.parseInt(st.nextToken());
      triangleArr[1] = Integer.parseInt(st.nextToken());
      triangleArr[2] = Integer.parseInt(st.nextToken());

      if (triangleArr[0] + triangleArr[1] + triangleArr[2] == 0){
        break;
      }

      Arrays.sort(triangleArr);
      if ( triangleArr[2] * triangleArr[2] == triangleArr[0] * triangleArr[0] + triangleArr[1] * triangleArr[1] ){
        bw.write("right\n");
      } else {
        bw.write("wrong\n");
      }
    }
    
    bw.flush();
    bw.close();
  }
}