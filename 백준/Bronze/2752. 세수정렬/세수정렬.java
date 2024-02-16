import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] nArr = new int[3];

    nArr[0] = Integer.parseInt(st.nextToken());
    nArr[1] = Integer.parseInt(st.nextToken());
    nArr[2] = Integer.parseInt(st.nextToken());

    Arrays.sort(nArr);

    for (int n : nArr) {
      bw.write(n + " ");
    }

    bw.write("\n");
    bw.flush();
    bw.close();
  }
}