import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());
    String[] resultArr = new String[t];

    for(int i = 0; i < t; i++){
      int schoolNum = Integer.parseInt(br.readLine());
      int maxNum = Integer.MIN_VALUE;

      for(int j = 0; j < schoolNum; j++){
        StringTokenizer st = new StringTokenizer(br.readLine());

        String schoolName = st.nextToken();
        int alcoholNum = Integer.parseInt(st.nextToken());

        if(maxNum < alcoholNum){
          maxNum = alcoholNum;
          resultArr[i] = schoolName;
        }
      }
    }

    for(int i = 0; i < t; i++){
      bw.write(resultArr[i] + "\n");
    }

    bw.flush();
    bw.close();
  }
}