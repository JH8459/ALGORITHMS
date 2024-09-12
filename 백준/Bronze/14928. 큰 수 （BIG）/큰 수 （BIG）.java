import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    long remain = 0;

    for(int i = 0; i < str.length(); i++){
      remain = (remain * 10 + (str.charAt(i) - '0')) % 20000303;
    }

    bw.write(remain + "\n");
    bw.flush();
    bw.close();
  }
}