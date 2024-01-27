import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] nList = new int[5];
    int sum = 0;

    for(int i = 0; i < 5; i++){
      nList[i] = (Integer.parseInt(br.readLine()));
      sum += nList[i];
    }

    Arrays.sort(nList);

    int avg = sum / 5;
    int middle = nList[2];

    bw.write(avg + "\n");
    bw.write(middle + "\n");
    bw.flush();
    bw.close();
  }
}