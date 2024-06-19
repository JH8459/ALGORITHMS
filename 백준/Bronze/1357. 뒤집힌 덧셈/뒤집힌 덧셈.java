import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    int sum = Reverse(x) + Reverse(y);

    bw.write(Reverse(sum) + "\n");

    bw.flush();
    bw.close();
  }

  public static int Reverse(int num){
    String word = String.valueOf(num);
    StringBuilder sb = new StringBuilder();

    for(int i = word.length() - 1; i >= 0; i--){
      sb.append(word.charAt(i));
    }

    return Integer.parseInt(String.valueOf(sb));
  }
}