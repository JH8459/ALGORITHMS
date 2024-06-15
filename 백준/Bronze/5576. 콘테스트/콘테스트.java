import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] wArr = new int[10];
    int[] kArr = new int[10];

    for(int i = 0; i < 20; i++){
      if(i < 10){
        wArr[i] = Integer.parseInt(br.readLine());
      } else {
        kArr[i - 10] = Integer.parseInt(br.readLine());
      }
    }

    Arrays.sort(wArr);
    Arrays.sort(kArr);

    int wScore = wArr[wArr.length - 1] + wArr[wArr.length - 2] + wArr[wArr.length - 3];
    int kScore = kArr[kArr.length - 1] + kArr[kArr.length - 2] + kArr[kArr.length - 3];

    bw.write(wScore + " " + kScore + "\n");
    bw.flush();
    bw.close();
  }
}