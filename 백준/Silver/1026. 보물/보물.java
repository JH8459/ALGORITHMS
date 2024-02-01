import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int[] aArr = new int[n];
    int[] bArr = new int[n];

    st = new StringTokenizer(br.readLine());

    for(int i = 0; i < n; i++){
      aArr[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());

    for(int i = 0; i < n; i++){
      bArr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(aArr);
    Arrays.sort(bArr);

    int result = 0;

    for(int i = 0; i < n; i++){
      result += aArr[i] * bArr[n - i - 1];
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}