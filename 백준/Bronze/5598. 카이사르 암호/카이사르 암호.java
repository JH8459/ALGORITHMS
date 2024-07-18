import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine();
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < s.length(); i++){
      char ch = s.charAt(i);

      if(ch - 3 < 'A'){
        sb.append((char) (ch + 23));
      } else {
        sb.append((char) (ch - 3));
      }
    }

    bw.write(sb + "\n");
    bw.flush();
    bw.close();
  }
}