import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] nArr = new int[n];

    for(int i = 0; i < n; i++){
      nArr[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(nArr);

    for(int i : nArr){
      bw.write(i + "\n");
    }

    bw.flush();
    bw.close();
  }
}