import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String n = br.readLine();
    int result = 0;

    if(n.charAt(1) == '0'){
      result = 10 + Integer.parseInt(n.substring(2));
    } else {
      result = Integer.parseInt(n.substring(0, 1)) + Integer.parseInt(n.substring(1));
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}