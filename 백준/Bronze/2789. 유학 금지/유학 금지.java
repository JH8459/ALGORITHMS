import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine();
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < s.length(); i++){
      char ch = s.charAt(i);

      if(!(ch == 'C' || ch == 'A' || ch == 'M' || ch == 'B' || ch == 'R' || ch == 'I' || ch == 'D' || ch == 'G' || ch == 'E')){
        sb.append(ch);
      }
    }

    bw.write(sb + "\n");
    bw.flush();
    bw.close();
  }
}