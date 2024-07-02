import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine();
    String[] sArr = new String[s.length()];

    for(int i = 0; i < s.length(); i++){
      sArr[i] = s.substring(i);
    }

    Arrays.sort(sArr);

    for(int i = 0; i < s.length(); i++){
      bw.write(sArr[i] + "\n");
    }

    bw.flush();
    bw.close();
  }
}