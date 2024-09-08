import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine();

    if(s.length() > 5 && s.substring(s.length() - 5).equals("driip")){
      bw.write("cute\n");
    } else {
      bw.write("not cute\n");
    }

    bw.flush();
    bw.close();
  }
}