import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    for(int i = 0; i < n; i++){
      int[] numArr = new int[20];
      StringTokenizer st = new StringTokenizer(br.readLine());

      int result = 0;
      int caseNum = Integer.parseInt(st.nextToken());

      for(int j = 0; j < 20; j++){
        numArr[j] = Integer.parseInt(st.nextToken());
      }

      for(int j = 0; j < 20; j++){
        for(int k = 0; k < j; k++){
          if(numArr[k] > numArr[j]){
            result++;
          }
        }
      }


      bw.write(caseNum + " " + result + "\n");
    }

    bw.flush();
    bw.close();
  }
}