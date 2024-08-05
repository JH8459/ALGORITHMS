import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s1 = br.readLine();
    String s2 = br.readLine();

    if(s1.length() >= s2.length()){
      bw.write("go\n");
    } else {
      bw.write("no\n");
    }

    bw.flush();
    bw.close();
  }
}